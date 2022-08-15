package Day03_Scanner;

public class C03_Swap {

    public static void main(String[] args) {
        /* verilen sayi1 ve sayi2 variable larının değerlerini değiştiren bir program yazınız
         sayi1=10
         sayi2=20
         kod çalıştıktan sonra
         sayi1=20
         sayi2=10



         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi2;  //10   20  20

        sayi2 = sayi1;   // 10  10  20

        sayi1 = sayi3;


        System.out.println("swapdan sonra sayi1 : " + sayi1);   //20
        System.out.println("swap dan sonra sayi2 : " + sayi2);   //10
    }
}
