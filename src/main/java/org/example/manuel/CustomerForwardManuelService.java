package org.example.manuel;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CustomerForwardManuelService {
    private final AccountManuelService accountManuelService;

    public CustomerForwardManuelService(AccountManuelService accountManuelService) {
        this.accountManuelService = accountManuelService;
    }

    public String customerForward(String type){
        if(type.equals("individual")) return accountManuelService.individualAccountForward();
        else if(type.equals("corporate")) return  accountManuelService.corporateAccountForward();
        else if (type.equals("notRegistered"))  return accountManuelService.notRegisteredAccount();
        else return "An Invalid Account: " + type;

    }
}
