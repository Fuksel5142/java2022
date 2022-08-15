package day08_İfstatements;

import java.util.Scanner;

public class C05_Nestedİfelsestatemnet {

    public static void main(String[] args) {
        /* nested if kullanarak aşağıdaki soruyu çözen kodu yazınız
        kullanıcıdan bir şifre girmesini isteyin
        Eğer ilk harf büyük harf ise "A" olup olmadığını kontrol edin.
        İlk harf A ise "Gecerli Sifre" değilse "Gecersiz Sifre" yazdırın.



         */
        // ilk harf buyuk mu kucuk mu ?
        // ilk harf A veya z mi ?
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sıfre giriniz");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf>='A'&& ilkHarf<='Z'){  // önce ana yapı sonra alt yapı

            if (ilkHarf=='A'){
                System.out.println("Gecerli sifre");
            }else{
                System.out.println("Gecersiz sifre");
            }

        } else if (ilkHarf>='a' && ilkHarf<='z') {

            if (ilkHarf=='z'){
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }

        }else{
            System.out.println("Lütfen ilk karakter için sadece harf kullanın");
        }
    }
}
