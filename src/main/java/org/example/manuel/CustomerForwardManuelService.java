package org.example.manuel;

public class CustomerForwardManuelService {
    AccountManuelService accountManuelService;

    public String customerForward(String type){
        if(type.equals("bireysel")) return accountManuelService.individualAccountForward();
        else if(type.equals("kurumsal")) return  accountManuelService.corporateAccountForward();
        else if (type.equals("izinsiz"))  return accountManuelService.notRegisteredAccount();
        else return "Geçersiz bir seçim yaptınız.";

    }
}
