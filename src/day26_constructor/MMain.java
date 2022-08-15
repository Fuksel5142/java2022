package day26_constructor;

public class MMain {
    public static void main(String[] args) {
        // Değişken tanımlaması
        int a =255,b=137;
        // Constructor Nesne tanımlamaları
        Point konum=new Point();
        Point konum2=new Point(a);
        Point konum3=new Point(a,b);
        System.out.println("-----------\n-Constructor (Yapıcı) metot tanımlaması\n---------");
        System.out.println("1-> Default constructor kod çıktısı :"+
                konum.konumYaz());
        System.out.println("2-> Default constructor kod çıktısı: "+
                konum2.konumYaz());
        System.out.println("3-> Default constructor kod çıktısı :"+
                konum3.konumYaz());
        System.out.println("Fatih Yüksel \n--------- ");

    }
}
