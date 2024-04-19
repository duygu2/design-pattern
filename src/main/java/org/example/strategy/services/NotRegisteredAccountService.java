package org.example.strategy.services;

import org.example.strategy.AccountType;
import org.springframework.stereotype.Service;

@Service
public class NotRegisteredAccountService implements AccountService {
    @Override
    public String accountForward() {
        //System.out.println("Hesap oluşturma sayfasına yönlendiriliyorsunuz...");
        return "Hesap oluşturma sayfasına yönlendiriliyorsunuz...";
    }

    @Override
    public boolean isApplicable(String type) {
        return AccountType.notRegistered.equals(type);
    }
}
