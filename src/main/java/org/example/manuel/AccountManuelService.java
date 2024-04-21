package org.example.manuel;

import org.springframework.stereotype.Service;

@Service
public class AccountManuelService {

    public String individualAccountForward(){
        return "You are directed to the individual account.. ";
    }

    public String corporateAccountForward(){
        return "You are directed to the corporate account.. ";
    }

    public String notRegisteredAccount(){
        return "You are directed to the register page.. ";
    }

}
