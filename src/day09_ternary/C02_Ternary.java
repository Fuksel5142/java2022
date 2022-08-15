package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan  bir sayı alın.Sayı pozitifse "Sayı pozitif" yazdırın,
        // negatifse sayının karesini yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        // eğer ternary içindeki sonuçlar farklı data türlerinde ise
        // atama yapamayız sadece yazdırabiliriz
       // String sonuc= sayi>0 ?"Sayi Pozitif" : (sayi*sayi);
        System.out.println(sayi<0 ? "Sayi Pozitif" : (sayi*sayi));
    }
}
