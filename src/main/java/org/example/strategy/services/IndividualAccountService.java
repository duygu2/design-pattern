package org.example.strategy.services;

import org.example.strategy.AccountType;
import org.example.strategy.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class IndividualAccountService implements AccountService {
    @Override
    public String accountForward() {
        return "You are directed to the individual account..";
    }

    @Override
    public boolean isApplicable(String type) {
        return AccountType.individual.toString().equals(type);
    }
}
