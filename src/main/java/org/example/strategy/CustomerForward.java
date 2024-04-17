package org.example.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CustomerForward {

    private AccountService accountService;

    public void setAccountService(AccountService accountService){
        this.accountService=accountService;
    }

    public void accountForward(){

        if(accountService == null){
            throw new RuntimeException("Hesap tipine erişilemedi");

        }
        accountService.accountForward();
    }

}
