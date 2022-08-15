package day20_arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {
        //iki sekilde Array olusturulabilşr
        int sayilar[]={1,2,3,};
        String harfler[]= new String[4];
        System.out.println("Sayilar array uzunlugunu yazdır : " +sayilar.length);
//String length methodunda parantez var Array de yok
        System.out.println("Harfler array uzunlugunu yazdır : " + harfler.length);
        System.out.println(Arrays.toString(harfler));

        //harfler Array inin son elementini yazalım
        System.out.println(harfler[harfler.length-1]);
//System.out.println(harfler[5]);public class ArrayIndexOutOfBoundsException
    }
}