package org.example.strategy.services;

import org.example.strategy.AccountType;
import org.example.strategy.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class NotRegisteredAccountService implements AccountService {
    @Override
    public String accountForward() {
        return "You are directed to the register page..";
    }

    @Override
    public boolean isApplicable(String type) {
        return AccountType.NOT_REGISTERED.toString().equals(type);
    }
}
