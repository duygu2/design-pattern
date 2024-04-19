package org.example.strategy.services.concretes;

import org.example.strategy.AccountType;
import org.example.strategy.services.abstratcs.AccountService;
import org.springframework.stereotype.Service;

@Service
public class CorporateAccountServiceImpl implements AccountService {
    @Override
    public String accountForward() {
        //System.out.println("Kurumsal hesaba yönlendiriliyorsunuz.. ");
        return "Kurumsal hesaba yönlendiriliyorsunuz.. ";
    }
    @Override
    public boolean isApplicable(String type) {
        return AccountType.corporate.equals(type);
    }
}
