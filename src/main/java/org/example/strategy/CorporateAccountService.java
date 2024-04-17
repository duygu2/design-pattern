package org.example.strategy;

import org.springframework.stereotype.Service;

@Service
public class CorporateAccountService implements AccountService {
    @Override
    public void accountForward() {
        System.out.println("Kurumsal hesaba yönlendiriliyorsunuz.. ");

    }
}
