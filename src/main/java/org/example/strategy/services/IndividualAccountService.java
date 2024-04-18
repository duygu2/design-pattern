package org.example.strategy.services;

import org.example.strategy.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class IndividualAccountService implements AccountService {
    @Override
    public void accountForward() {
        System.out.println("Bireysel hesaba yönlendiriliyorsunuz...");
    }

    @Override
    public boolean isApplicable(String type) {
        return "bireysel".equals(type);
    }
}
