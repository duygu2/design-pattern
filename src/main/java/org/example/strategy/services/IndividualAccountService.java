package org.example.strategy.services;

import org.example.strategy.enums.AccountType;
import org.springframework.stereotype.Service;

@Service
public class IndividualAccountService implements AccountService {
    @Override
    public String accountForward() {
        return "You are directed to the individual account..";
    }

    @Override
    public boolean isApplicable(String type) {
        return AccountType.INDIVIDUAL.toString().equals(type);
    }
}
