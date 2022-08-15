package day6_practice;

import java.util.Scanner;

public class kopy {
    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        int sayi = scan.nextInt();

        int adet = 0;
        int toplam=0;

        while(sayi != 0)
        {
            toplam+=sayi%10;
            sayi/= 10;
            adet++;
        }

        System.out.println("Basamak Toplamı: " + toplam);
    }
}


