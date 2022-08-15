package day04_variables;

public class C05_Prepostincrement {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2= sayi1+1;
        sayi2 +=5;  //sayi 2 16

        /*
         pre ve ya post increment/decrement
         sadece ++ ve ya -- işlemi için geçerlidir
         bu iki işlem için sayıdan sonra ve ya önce yazılmasına göre farklı iki işleyiş olur

         */
         int sayi3 = sayi2++;
           /*
           sayi2 bir artıralacak sayi 2 değeri sayi 3 e atanacak
            */

         int sayi4=++sayi1;

    }
}
