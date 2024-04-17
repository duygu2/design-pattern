package org.example.strategy;

import org.springframework.stereotype.Service;

@Service
public class NotRegisteredAccountService implements AccountService {
    @Override
    public void accountForward() {
        System.out.println("Hesap oluşturma sayfasına yönlendiriliyorsunuz...");
    }
}
