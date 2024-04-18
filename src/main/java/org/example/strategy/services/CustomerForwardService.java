package org.example.strategy.services;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerForwardService {


    private final List<AccountService> accountServiceList;

   public CustomerForwardService(List<AccountService> accountServiceList) {
        this.accountServiceList = accountServiceList;
    }
    public void accountForward(String type){

        if (accountServiceList.isEmpty()) {
            throw new RuntimeException("hata!");
        }

        accountServiceList.stream()
                .filter(accountService -> accountService.isApplicable(type))
                .findFirst()
                .ifPresentOrElse(accountService -> accountService.accountForward(),
                        ()-> {throw new RuntimeException("Geçersiz hesap türü: " + type);}
                        );
    }

}
