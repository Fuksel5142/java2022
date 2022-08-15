package day30_Immutable_date;

import java.time.LocalTime;

public class C04_Localtime {
    public static void main(String[] args) throws InterruptedException {


        LocalTime time1= LocalTime.now();
        System.out.println(time1);
        /*
        Bizim oluşturduğumuz date ve time
        canli saat veya tarih değildir
        LocalTime.now(); kullandığımız satırda
        o anki tarih veya saati alıp
        bizim variable imiza store eder
        time1 variable nin değeri sabittir

         */

        Thread.sleep(3000);
        time1= LocalTime.now();
        System.out.println(time1.getSecond()); // getir
        System.out.println(time1.plusSeconds(10000));

        System.out.println(time1.minusMinutes(200));
        System.out.println(time1.withHour(3));


    }
}
