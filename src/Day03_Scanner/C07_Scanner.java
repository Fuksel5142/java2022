package Day03_Scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {
        /*bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız

         \n aralarda uzun olduğunda yani alta atmak için kullanılır
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi soyisminizi ve yaşınızı\n aralarda enter tuşuna basarak giriniz");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("Girilen bilgilerin Değeri = " +isim+" "+soyisim+" "+yas );



    }
}
