package org.example.strategy.services;

import org.example.strategy.enums.AccountType;
import org.springframework.stereotype.Service;

@Service
public class CorporateAccountService implements AccountService {
    @Override
    public String accountForward() {
        return "You are directed to the corporate account.. ";
    }
    @Override
    public boolean isApplicable(String type) {
        return AccountType.CORPORATE.toString().equals(type);
    }
}
