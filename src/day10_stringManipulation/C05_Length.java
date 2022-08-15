package day10_stringManipulation;

public class C05_Length {

    public static void main(String[] args) {

        String str= "java ogren isi kap";

        System.out.println(str.length());  // str in karakter sayısını doldurur

        System.out.println(str.charAt(str.length()-1)); // son karakteri yazdırır

        System.out.println(str.charAt(str.length()-3));

        /*  java da null pointer bir değer değil
        karşısına yazıldığı variable in hiç bir değer olmadığının işaretcisidir



         */

        String str2="" ;   // str 2 ye değeri hiçlik

        System.out.println(str2.length());    //0

        String str3=null;  // str 3 e bir değer atanmış mıdır HAYIR

    }
}
