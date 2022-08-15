package slack_odev;

import java.util.Scanner;

public class Sayıları_tersden {
    public static void main(String[] args) {
        /*
         * Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.123==>321 yada 1045==>5401 gibi.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number to find its reverse");
        int number=scan.nextInt();
        String tempNumber=String.valueOf(number);
        String reverse="";
        for (int i =  tempNumber.length(); i >0 ; i--) {
            reverse+=tempNumber.substring(i-1,i);

        }
        System.out.println(Integer .valueOf(reverse));



    }
}
