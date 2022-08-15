package day10_practice.okul_proje;

import java.util.Scanner;

public class enuzunkelimetekrar {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümnle giriniz");
        String cumle=scan.nextLine();

        System.out.println("enUzunKelime(cumle) ="+enuzunkelime(cumle));



    }

    public static String enuzunkelime(String cumle) {
        String arr[]=cumle.split(" ");
        int max=arr[0].length();
        String enuzunkelime=arr[0];
        for(String each:arr){
            if (each.length()>max){

                enuzunkelime=each;
            }
        }
        return enuzunkelime;

    }
}
