package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Periyot {
    public static void main(String[] args) {
        // iki tarih arasındaki süreyi bulma

        LocalDate tarih1 = LocalDate.of(1992,3,6);
        LocalDate  bugün= LocalDate.now();

        Period period= Period.between(tarih1, bugün);
        System.out.println(period);
        System.out.println(period.getYears());

    }
}
