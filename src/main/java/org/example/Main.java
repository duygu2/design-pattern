package org.example;

import org.example.strategy.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // strategy design pattern used


        //customerForward.accountForward();

        IndividualAccountService individualAccountService = new IndividualAccountService();

        CorporateAccountService corporateAccountService = new CorporateAccountService();

        NotRegisteredAccountService notRegisteredAccountService = new NotRegisteredAccountService();

        List<AccountService> accountServiceList = List.of(individualAccountService, corporateAccountService, notRegisteredAccountService);


        CustomerForward customerForward= new CustomerForward(accountServiceList);

        customerForward.accountForward("bireysel");
   /*

     // Manuel selected

    AccountManagement accountManagement = new AccountManagement() ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz! Hesap türünüzü seçiniz.. ");
        System.out.println(" 1 --> Bireysel Hesap ");
        System.out.println(" 2 --> Kurumsal Hesap ");
        System.out.println(" 3 --> Yeni Hesap oluşturma");

        int select= scanner.nextInt();

        switch (select){
            case 1:
                accountManagement.individualAccountForward();
                break;

            case 2:
                accountManagement.corporateAccountForward();
                break;

            case 3:
                accountManagement.notRegisteredAccount();
                break;

            default:
                System.out.println("Yanlış seçim! Program sonlanıyor.. ");
        }
*/
    }
}