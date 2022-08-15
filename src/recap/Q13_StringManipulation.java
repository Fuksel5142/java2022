package recap;

import java.util.Scanner;

public class Q13_StringManipulation {

    // kullanıcıdan isim ve soyisini girmesini isteyin ve hangisinin daha uzun olduğunu yazdırın

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lütfen ismini ve soyisminizi giriniz :\nisim");
        String isim= scan.next();
        System.out.println("Soyisminizi giriniz");
        String soyisim= scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden büyüktür");
        } else if (isim.length()==soyisim.length()) {
            System.out.println("isminiz soyisim ile eşit");

        }else{
            System.out.println("soyisminiz ismimnizden uzun");

        }

    }
}
