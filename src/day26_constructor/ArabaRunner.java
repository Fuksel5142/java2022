package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        // bir gün önceki car clasından obje oluşturalım
        Car car1=new Car();  // car1 yaptığında metotları görüyor ama variable ları public olmadığı
        // için görmüyor farklı bir package da acces modifier devreye giriyor her yerden ulaşılması için
        //public yapmamız lazım
        //farklı bir package daki bir class dan obje oluşturduğumuzda
        // acces modifier ları da dikkate almalıyız
        System.out.println(car1.fiyat);
        /*
        araba class ına bir obje oluşturduğumda
        eğer default constroctor kullanıldı ise
        tüm özellikler için tek tek değer atamak zorunda kalırız
         */

        Araba araba1=new Araba();// obje
        araba1.fiyat=100000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("Araba1 bilgileri\nMarka : " + araba1.marka +"\nModel : " + araba1.model
                +"\nYil : " + araba1.yil+ "\nFiyat  : " + araba1.fiyat);
        /*
        Eğer bir objeyi oluşturuken bazı özelliklerini argument olarak beliritp
        o özelliklerde bir obje oluşturmak istersek
        java itiraz eder.
        çünkü her  class da default constructor vardır
        ama o da parametresizdir
        bizim yeni veparametreli constructor(lar) a ihtiyacımız var.
         */
        Araba araba2=new Araba("BMW", "5.20" , 2011, 15000);

        System.out.println("Araba2 bilgileri\nMarka : " + araba2.marka +"\nModel : " + araba2.model
                +"\nYil : " + araba2.yil+ "\nFiyat  : " + araba2.fiyat);
        Araba araba3=new Araba("Opel", "Astra" , 2015, 200000);
        System.out.println("Araba3 bilgileri\nMarka : " + araba3.marka +"\nModel : " + araba3.model
                +"\nYil : " + araba2.yil+ "\nFiyat  : " + araba3.fiyat);
        Araba araba4=new Araba("Audio", "A5 " , 2020,500000);
        System.out.println("Araba4 bilgileri\nMarka : " + araba4.marka +"\nModel :  "+araba2.model
        +"\nYil : " + araba2.yil+ "\nFiyat  :");




    }
}
