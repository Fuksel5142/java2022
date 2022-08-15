package day11_stringManipulatıon;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {


        /* soru 1) kullanıcıdan email adresini girmesini isteyin,
        mail @gmail.com içermiyorsa  "Lütfen gmail adresi giriniz"
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"  ,
        @gmail.com ile bitiyorsa  lutfen yazımı kontrol edin yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email yazınız");
        String email= scan.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresini kaydedildi");

        }else{
            System.out.println("Lutfen yazımı kontrol edin");
        }
    }
}
