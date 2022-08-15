package Day03_Scanner;

public class C03_AsciTable {

    public static void main(String[] args) {

        int sayi= 10;
        char harf='a';
        String str="banan";

        System.out.println(str+harf);
        System.out.println(sayi+harf);

        /* char data türü işleme girdiği değişkenin türüne göre farklı davranabilir  eğer matematiksel
        işleme girdiği variable sayısal değerse sayı gibi davranır. sayı+harf sayı variablei int olduğundan harf variable
        i asci tablosundan 97 değerini kullanır

        char yeniHarf= harf+2 java önce sağdaki işlemi yapar, sağda int+ char görünce ascii sonra atama işlemi  yapmaya çalışr
        2 str- harf) ;   // banana String variable çok güçlüdür hangi data türü ile işleme girerse girsin
        diğer data türünü kendine benzetir



         */

        System.out.println("10a");

        System.out.println(sayi+harf);

        char deger='1';
        System.out.println(deger+harf);  // 1+ a

        System.out.println(deger);

    }
}
