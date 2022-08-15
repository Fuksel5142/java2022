package recap;

import java.util.Scanner;

public class Q08_StringManipulation {

    public static void main(String[] args) {

        /*   input=Ali
        *    output= lilili
        * el
        * el



        */
        Scanner scan= new Scanner(System.in);
        System.out.println("bir string giriniz :");
        String str= scan.nextLine();

        if (str.length()>=3){
            System.out.println(str.substring(str.length()-2) + str.substring(str.length()-2)+str.substring(str.length()-2));
        }else System.out.println(str);
    }
}
