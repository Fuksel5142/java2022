package day7_practice;

import java.util.Arrays;

public class Q04_Arraystekrar {
    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str=str.replace(" ", "");
        System.out.println(str);
        System.out.println("Karakter sayısı : "+ str.length());

        String [] arr=str.split("");
        System.out.println("karakter sayısı : " +arr.length);

        String str1="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String [] kelime=str1.split(" ");
        int bosluksayisi=kelime.length-1;
        System.out.println("bosluksayisi : " +bosluksayisi);

        String Character[]=str1.split("");
        System.out.println("Character : " + Arrays.toString(Character));
        System.out.println("karakter sayısı : " + (Character.length-bosluksayisi));















    }

}
