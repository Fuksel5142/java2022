package Day41_Abstractclass;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {

    /*
    Abstract parent silsilesinden gelen ilk concrete class
    paranti olan tüm class daki abstract methodları
    concrete hale dönüştürmek (override) ZORUNDADIR
    bu kuralın istisnası parent class lardan herhangi birinde
    concrete hale dönüştürülmüş,abstract method lardır
     */
    public static void main(String[] args) {

        HA160 arb1 = new HA160();
        // concrete bir class dan istediğimiz objeyi üretebilirz

        FMercedes arb2 = new FMercedes();
        // mercedes de concrete

        //EToyota arb3 = new EToyota();
        // abstract classlar constructor barındırır
        // ama obje üretemezler
        // toyota class ı abstract class olduğundan obje üretilemez
        /*
        List<String> list = new List<String>();
        List<String> list2 = new ArrayList<String>();

        Abstract bir class ın özelliklerini taşıyan bir obje oluşturmak istediğimizde
        Data türünü istediğimiz abstract class
        constructor ı ise child olan concrete bir class dan seçeriz


       */

    }
}
