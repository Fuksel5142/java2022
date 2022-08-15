package day31_timeformater_varags;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk oluşturulan tarih:"+tarihSaat);
        // ilk oluşturulan tarih: 2022-07-25T20

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yyyy HH:mm");
        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm a");

        System.out.println(dtf2.format(tarihSaat));





    }
}
