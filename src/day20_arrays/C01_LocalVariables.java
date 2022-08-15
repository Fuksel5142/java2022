package day20_arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
        int sayi=10;
        //System.out.println(sayiMethod); sayiMethod method1de olusturulmus
        //local variabledır
        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
        //System.out.println(i); i loopta olustuırulmus local variabledır
        //sadece loop icerisinde kullanılmalıdır.
        // static int sayiStatic=20; static keyword sadece class levelda
        // kullanılır methodların icerisinde static variable TANIMLANMAZ
    }
    public static void method (){
        //System.out.println(sayi); sayi main methodda olusturulmus
        //local variable ve sadece main methodda gecerli
        int sayiMethod=20;
    }
}