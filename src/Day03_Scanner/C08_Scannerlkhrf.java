package Day03_Scanner;

import java.util.Scanner;

public class C08_Scannerlkhrf {

    public static void main(String[] args) {

        // kullanıcıdan ismini alıp, ilk harfini büyük harf olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        //* java scanner class ında nextchar () methodu yoktur
        // bunun yerine String olarak ilk kelimeyi alıp
        //onu da şlk harfini alabilir
        char ilkharf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi : " + ilkharf);
    }
}
