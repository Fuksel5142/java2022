package day10_practice.okul_proje;

import java.util.Scanner;

public class UzunKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümnle giriniz");

        String cumle= scanner.nextLine();

        System.out.println("enUzunKelimecumle = " + enUzunKelime(cumle));

        // ben bugün javayi daha cok sevdim ama çok zorlandım "" her karakter arası
        // " " boşuklar arası böler
    }

    public static String enUzunKelime(String cumle) {

        String arr[]=cumle.split(" ");
        int max=arr[0].length();
        String longestWord="";
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>max){
                max=arr[i].length();// ilk calistitiginda kod max = 3 oldu
                longestWord=arr[i];

            }

        }
        return longestWord;
        // split string metodu direk arraye cevirri
    }
}
