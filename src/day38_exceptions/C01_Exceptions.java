package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        Bir sorunla karşılaşmayı beklediğiniz noktalarda
        if else ile sorunu yakalayıp onunla ilgili
        çözüm üretebilirsiniz

        ama java sorunu her zaman if else ile çözemeyeceğimizden
        java try-catch blokları oluşturmuştır
         */


        int a=1000;
        int b=50;
        int sayac=1;
        while (sayac<100) {
            if (b == 0) {
                System.out.println("İşlem yapılırken ypayda 0 oldu dikkat");
            } else {
                System.out.println(a / b);
            }
                b--;
                sayac++;
            }


        }}

