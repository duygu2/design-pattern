package org.example.strategy.services;

import org.springframework.stereotype.Service;

@Service
public class NotRegisteredAccountService implements AccountService {
    @Override
    public void accountForward() {
        System.out.println("Hesap oluşturma sayfasına yönlendiriliyorsunuz...");
    }

    @Override
    public boolean isApplicable(String type) {
        return "izinsiz".equals(type);
    }
}
