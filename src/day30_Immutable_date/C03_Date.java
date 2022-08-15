package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.isLeapYear()); //

        LocalDate tarih2 = LocalDate.of(2001, 5, 15);
        System.out.println(tarih2); //2001-05-15

        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY, 10);
        System.out.println(tarih3); //1990-01-10
        System.out.println(tarih.plusDays(100)); //2022-10-31
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20));// çıkarma //2022-03-05

        System.out.println(tarih.minusDays(100).minusMonths(5));// 2021-11-14

        System.out.println(tarih.isAfter(tarih2));// true

        // iki farklı doğum günü girildiğnde hangisisnin
        // doğanın daha büyük olduğunu bulunuz

        // tarih 2 ve tarih3 için bunu yapalım
        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else {
            System.out.println("iki tarih birbiri ile ayni");
        }
    }
}

