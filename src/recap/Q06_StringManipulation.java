package recap;

import java.util.Scanner;

public class Q06_StringManipulation {

    // Scanner kullanarak iki ayrı değer giriniz ve bu iki kelimeyi String manipulation method
    // kullanarak yukarıdaki ornekte verilen ilk ve ikinci değişkenlerinin ilk harflerini atıp birleştiriniz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" String 1 :");
        String str1= scan.nextLine();

        System.out.println(" String 2 :");
        String str2= scan.nextLine();

        System.out.println("1.yöntem :" + str1+ " "+str2);
        System.out.println("2. yöntem:" +str1.concat(" "+str2));

        String str1_0indextensonrasi= str1.substring(1);
        String str2_0indextensonrasi= str2.substring(1);

        System.out.println("Manipulationdan sonraki hali :"+str1_0indextensonrasi+ "" +str2_0indextensonrasi);
    }
}
