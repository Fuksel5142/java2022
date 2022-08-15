package day07_ifstatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_Basitifsttments {

    public static void main(String[] args) {
        /* soru 3 kullanıcıdan gun ismini alın ve haftaiçi veya haftasonu
        olduğunu yazdırın
        örnek gun= Pazar output = "hafta sonu"
        gun= sali output = "hafta içi"
        ** String için equals method unu kullanalım



         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();
        // pazar, pazar PAZAR, Pazar

        if (girilenGun.equals("pazar") ||girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")|| girilenGun.equals("carsamba") ||
          girilenGun.equals("persembe") || girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAİCİ");
        }

        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
        || girilenGun.equals("carsamba") || girilenGun.equals("persembe") ||
        girilenGun.equals("cuma") || girilenGun.equals("cumartesi") ||
        girilenGun.equals("pazar"))){
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }
    }
}
