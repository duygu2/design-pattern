package org.example.strategy.services.concretes;

import org.example.strategy.services.abstratcs.AccountService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerForwardStrategyService {


    private final List<AccountService> accountServiceList;

   public CustomerForwardStrategyService(List<AccountService> accountServiceList) {
        this.accountServiceList = accountServiceList;
    }
    public String customerForward(String type){

        if (accountServiceList.isEmpty()) {
            throw new RuntimeException("Hesap türü bulunamadı!");
        }

        Optional<String> result= accountServiceList.stream()
                .filter(accountService -> accountService.isApplicable(type))
                .findFirst()
                .map(accountService -> accountService.accountForward());

        return result.orElseThrow(()-> new RuntimeException("Geçersiz hesap türü " + type));

    }

}
