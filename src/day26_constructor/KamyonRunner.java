package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1 = new Kamyon();
        System.out.println("Kamyon 1 ozellikleri " + kamyon1.toString());
        /*
        to string yazdırmak icin

         */
        Kamyon kamyon2 = new Kamyon("Mercedes","4100",2005,500000);
        System.out.println("Kamyon 2ozellikleri " + kamyon2.toString());

        Kamyon kamyon3 = new Kamyon("Man","As900",2007,450555);
        System.out.println("kamyon3 ozellikleri " + kamyon3.toString());

        Kamyon kamyon4 = new Kamyon("Scania","S540");
        //iki parametreli consturucyor yok
        System.out.println("kamyon4 bilgileri " + kamyon4.toString());




    }
}
