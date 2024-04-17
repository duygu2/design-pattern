package org.example.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CustomerForward {

    private final List<AccountService> accountServiceList;

    public CustomerForward(List<AccountService> accountServiceList) {
        this.accountServiceList = accountServiceList;
    }

    public void accountForward(String type){

        if (accountServiceList.isEmpty()) {
            throw new RuntimeException("hata!");
        }

        accountServiceList.stream()
                .filter(accountService -> accountService.isApplicable(type))
                .findFirst()
                .ifPresent(accountService -> accountService.accountForward());

    }

}
