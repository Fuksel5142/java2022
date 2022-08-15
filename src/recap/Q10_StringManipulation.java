package recap;

import java.util.Scanner;

public class Q10_StringManipulation {

    /*
    *girilen String içinde "xyz" dizimi var ise true değilse false return eden method yazınız
    *input    output
    * axyzm   true
    * xyz   true
    * x.yz  false
    * xyaz   false
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir string giriniz :");
        String str= scan.nextLine().toLowerCase();
        xyzVarmi(str);

    }

    private static boolean xyzVarmi(String str) {
        if (str.contains("xyz")){
            return true;
        }else
            return false;
    }
}
