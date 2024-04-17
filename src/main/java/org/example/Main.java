package org.example;

import org.example.strategy.CorporateAccountService;
import org.example.strategy.CustomerForward;
import org.example.strategy.IndividualAccountService;
import org.example.strategy.NotRegisteredAccountService;

public class Main {
    public static void main(String[] args) {

        // strategy design pattern used

        CustomerForward customerForward= new CustomerForward();

        //customerForward.accountForward();

        customerForward.setAccountService(new IndividualAccountService());
        customerForward.accountForward();

        customerForward.setAccountService(new CorporateAccountService());
        customerForward.accountForward();

        customerForward.setAccountService(new NotRegisteredAccountService());
        customerForward.accountForward();




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