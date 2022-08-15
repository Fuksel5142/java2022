package day7_practice;


import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    public static void main(String[] args) {
        farkınıBul();

    }

    private static void farkınıBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Arrayin Uzunluğunu Giriniz");
        int uzunluk=scanner.nextInt();
        int arr []=new int[uzunluk];

        for(int i=0;i<uzunluk;i++) {
            System.out.println("araryin " +(i+1) + ". elemanini giriniz :");
            arr[i] = scanner.nextInt(); // atadığımız arrayin ataması böyle
        }
        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark : " +(arr[uzunluk-1]-arr[0]));

    }

}
