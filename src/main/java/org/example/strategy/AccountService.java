package org.example.strategy;

public interface AccountService {

    void accountForward();

    boolean isApplicable(String type);

}
