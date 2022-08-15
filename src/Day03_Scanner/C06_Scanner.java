package Day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        /*
        kullanıcıdan ismi soyismini ve yasini alip
        girilen bilgiler= seyfi çapar 34 şeklinde yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        /* string verileri scanner ile alırken
        next() ilk boşluğa kadar alır
        nextline satırın sonuna kadar alır
        eğer ardarda birden fazla string değer alacaksak nextline kullanmalıyız

         */
        String isim=scan.nextLine();

        System.out.println("Lütfen soyiminizi girin");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen Yaşınızı Girin");
        Double yas=scan.nextDouble();

        System.out.println("Girilen Bilgiler  =" +isim+" "+soyisim+" "+yas );  // + işaretlerine iyi bak

    }
}
