package day31_timeformater_varags;

public class C03_VaragieToplama {
    public static void main(String[] args) {
        // verilen 2 int i toplayıp sonucu yazdıran
        // bir method oluşturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1, sayi2, sayi3,sayi4,sayi5);
        toplaYazdir(sayi1, sayi2, sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public static void toplaYazdir(int... sayi){
        /*
        Hocam derse baslamadan birsey sorsam : Olusturdugumuz bir return methodun icinden´ayni anda int ve String i return edebilir miyiz ?
        1 defa
        int... sayi bu gösterim integer variable lardan oluşan
        bir varags demektir
        vararg array alt yapısını kullanır
        */
        int sayiAdedi=sayi.length;// arr olduğu için int lenght aldı yoksa almaz
        int toplam=0;// toplamı bulabilmek için variable oluştur
        for (int each :sayi) {
            toplam+=each;

        }
        System.out.println("Girilen"+sayiAdedi+ "adet sayının toplamı :"+ toplam);



    }



}
