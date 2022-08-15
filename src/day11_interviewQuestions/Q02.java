package day11_interviewQuestions;

import java.util.Scanner;

public class Q02 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
     *  alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String input=scan.nextLine();
        System.out.println("Lütfen bir sayı  giriniz");
        int sayi= scan.nextInt();

        System.out.println("girilen stringin ilk ve son harfinin" +
                " istenen sayi kadar birlesik hali :" +ilkSonHarf(input,sayi));
    }

    private static String ilkSonHarf(String input, int sayi) {
        String string=input.substring(0,1)+input.substring(input.length()-1);// stringden yeni string oluşturma
        // bunu daha yeni öğrendim
        String sub="";
        for (int i = 1; i <=sayi ; i++) {
            sub+=string;

        }
        return sub;


    }
}
