package org.example.strategy.services;

import org.example.strategy.AccountType;
import org.springframework.stereotype.Service;

@Service
public class CorporateAccountService implements AccountService {
    @Override
    public String accountForward() {
        //System.out.println("Kurumsal hesaba yönlendiriliyorsunuz.. ");
        return "You are directed to the corporate account.. ";
    }
    @Override
    public boolean isApplicable(String type) {
        return AccountType.corporate.toString().equals(type);
    }
}
