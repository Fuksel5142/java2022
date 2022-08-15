package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArguöemtxception {
    public static void main(String[] args) {
        // soru: Kullanıcıdan yasını girmesini isteyin
        //Kodunuzu kullanıcı sıfırdan kucuk bir sayı girerse
        // Exception verecek şekilde yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas = scan.nextInt();

        try {
            if (yas < 0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("yasınızı :" + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz");
        }

    }
}
