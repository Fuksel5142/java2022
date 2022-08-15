package day09_ternary;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı isteyin
        // sayı pozitifse sayıyı yazdırın
        // sayı sıfır ve ya negatifse bir sayı daha isteyin ve ikisinin çarpımını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("Lütfen bir sayı giriniz");
            double sayi1= scan.nextDouble();
            System.out.println(sayi1*sayi) ;
        }
    }
}
