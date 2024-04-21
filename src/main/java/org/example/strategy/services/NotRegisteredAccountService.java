package org.example.strategy.services;

import org.example.strategy.AccountType;
import org.example.strategy.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class NotRegisteredAccountService implements AccountService {
    @Override
    public String accountForward() {
        //System.out.println("Hesap oluşturma sayfasına yönlendiriliyorsunuz...");
        return "You are directed to the register page..";
    }

    @Override
    public boolean isApplicable(String type) {
        return AccountType.notRegistered.toString().equals(type);
    }
}
