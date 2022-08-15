package recap;

import java.util.Scanner;

public class Q12_StringManipulation {

    public static void main(String[] args) {
        /* Kullanıcıdan bir kelime girmesini isteyin.
        * sozcukte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa,
        * kelimenin ortasındaki karakteri yazdırın.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime=scan.next();

        char ortancaKrk= kelime.charAt((kelime.length()-1)/2);
        if (kelime.length()%2==1  && kelime.length()>=3 ){
            System.out.println("ortanca karakter :"+ ortancaKrk);
        } else {
            System.out.println(" ya erramerrahimin");
        }





    }
}









