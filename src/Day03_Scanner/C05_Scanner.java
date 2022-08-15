package Day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        /*
        kullanıcıdan iki sayı alıp
        bı sayoların çarpımını yazdırın
         */
        // 1. adım
        Scanner scan =new Scanner(System.in);
        //2 . adım
        System.out.println("Lütfen ilk sayıyı girin");
        //3. adım
       double sayi1 =scan.nextDouble();
        System.out.println("Lütfen 2. sayıyı girin" );
          double sayi2 =scan.nextDouble();
        System.out.println("Girilen sayıların çarpımı :" +sayi1*sayi2);


    }
}
