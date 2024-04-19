package org.example.strategy.services.concretes;

import org.example.strategy.AccountType;
import org.example.strategy.services.abstratcs.AccountService;
import org.springframework.stereotype.Service;

@Service
public class IndividualAccountServiceImpl implements AccountService {
    @Override
    public String accountForward() {
        //System.out.println("Bireysel hesaba yönlendiriliyorsunuz...");
        return "Bireysel hesaba yönlendiriliyorsunuz...";
    }

    @Override
    public boolean isApplicable(String type) {
        return AccountType.individual.equals(type);
    }
}
