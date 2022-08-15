package recap;

import java.util.Scanner;

public class Q09_StringManipulation {

    /*   ornek : inputs: cesaret insana sinirlarini ogretir
     outputs: Cesaret insana sinirlarini ogretir.


     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle olusturmak için birinci kelimeyi giriniz");
        String str1= scan.next();
        System.out.println("cumle oluşturmak için ikinci kelimeyi giriniz");
        String str2= scan.next();
        System.out.println("cumle oluşturmak için üçüncü kelimeyi giriniz");
        String str3= scan.next();
        System.out.println("cumle oluşturmak için dördüncü kelimeyi giriniz");
        String str4= scan.next();
        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1)+" "
        + str2+ " "+str3+ " "+str4+ " .");
    }
}
