package Notlar;

import java.util.Scanner;

public class fonksiyon {
    public static void selamlama(){
        System.out.println("dddd");
        System.out.println("eeeee");
    }
    public static void  toplama(int a,int b){
        System.out.println("Toplamlar : "  +a + b);

    }
    public static void faktöriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi = scanner.nextInt();
        int faktöriyel=1;
        while (sayi>0){
            faktöriyel*=sayi;
            sayi--;
        }
        System.out.println("Faktöriyel:"+faktöriyel);
    }

    public static void main(String[] args) {
        faktöriyel();
        toplama(3,5);

    }
}
