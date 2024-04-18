package org.example.strategy.services;

public interface AccountService {

    void accountForward();

    boolean isApplicable(String type);

}
