package day05_variables;

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
           ++ veya -- variable dan sonra olursa buna post...
           bu durumda o satırda yapılan iki işlemden
           artırma veya azaltma işlemi sonucudur

            */
        System.out.println("sayi3 : " + sayi3);
        System.out.println("sayi2 : " + sayi2 );


         int sayi4=++sayi1;
         /*
         eğer ++ ve ya -- variable dan önce ise buna pre .... denir.
         bu durumda o satırda yapılan iki işlemden öncelikli olan artırma
         veya azaltmadır


          */
        System.out.println("sayi4 : " + sayi4);
        System.out.println("sayi1 : " + sayi1);


    }
}
