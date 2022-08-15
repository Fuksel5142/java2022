package day06_variables;

import java.util.Scanner;

public class C01_WrapperClasses {

    public static void main(String[] args) {

         /*
    Wrapper class javanın hazır methodları kullanabilmemiz için
    primitive data türlerinin herbiri için açtığı class'lardır


     */

        String str= "java ile hayat ne güzel";
        System.out.println(str.toUpperCase());

        boolean guzelmi= true;
                // guzelmi. boolean primitive olduğundan hazır methodu bulunmuyor

        Boolean buguzelmi=true;
        buguzelmi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir şifre giriniz");

        String sifre= scan.nextLine();

        Integer sifresayi= Integer.parseInt(sifre);


        System.out.println("girilen şifenin 3 fazlası : "+ (sifre+3));
        System.out.println("Integer sifrenin 3 fazlası :"+ (sifresayi+3));

    }




}
