package day6_practice;

import java.util.Scanner;

public class Q11_Odev {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {

        String pin = "mehmet.1234";
        int girishakki=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("********HOSGELDINIZ*********");

        while (true) {
            System.out.println("pin kodunuzu giriniz : ");
            String girilenPin=scan.nextLine();
            if (girilenPin.equals(pin)) {
                System.out.println("basarili giris yaptiniz..");
                break;
            }else {
                System.out.println("yanlis giris yaptiniz.. ");
                girishakki--;
                System.out.println("kalan giris hakkınız : "+girishakki );
            }
            if (girishakki == 0) {
                System.out.println("giris hakkiniz kalmadi..bloklandiniz..");
                break;
            }
        }

    }
}
