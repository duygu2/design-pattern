package org.example.manuel;

import org.springframework.stereotype.Service;

@Service
public class AccountManuelService {

    public String individualAccountForward(){
        return "Bireysel hesaba yönlendiriliyorsunuz...";
    }

    public String corporateAccountForward(){
        return "Kurumsal hesaba yönlendiriliyorsunuz...";
    }

    public String notRegisteredAccount(){
        return "Hesap oluşturma sayfasına yönlendiriliyorsunuz..";
    }

}
