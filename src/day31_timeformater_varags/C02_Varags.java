package day31_timeformater_varags;

public class C02_Varags {
    public static void main(String[] args) {
        // verilen 2 int i toplayıp sonucu yazdıran
        // bir method oluşturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        toplaYazdir(sayi1,sayi2,sayi3);
    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("Verilen üç sayının toplamı :"+(sayi1+sayi2+sayi3));
    }
}
