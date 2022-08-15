package day7_practice;

import java.util.Arrays;

public class Q04_Arrays{
/*
 *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
 *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
 */
public static void main(String[] args) {
    String str= "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
    str=str.replace(" ", "");
    System.out.println(str);
    System.out.println("Karakter sayısı :"+ str.length());

    String[] arr = str.split("");
    System.out.println(Arrays.toString(arr));
    System.out.println(arr.length);

    String str1 ="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
    String kelime []= str1.split(" "); // böyle oldumu aralara virgül atar

    int bosluksayisi=kelime.length-1; // aralara boşluk koyduğu için hali ile kelimenin uzunluğunuun bir eksiği olıuyor
    System.out.println("bosluksayisi :"+ bosluksayisi);

    String Character []= str1.split("");
    System.out.println("karakter sayısı :"+ (Character.length-bosluksayisi));


}
}
