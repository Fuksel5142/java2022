package day14_methodCreation;

public class C04_copy {
    public static void main(String[] args) {
        // Input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun

        String isim="Enes";
        String soyismi="Bozkurt";
        ismiGizle(isim,soyismi);


    }

    private static void ismiGizle(String isim, String soyismi) {
        isim=isim.substring(0).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyismi=soyismi.substring(0).toUpperCase()+soyismi.substring(1).replaceAll("\\w","*");
        System.out.println(isim+ " "+soyismi );
    }
}
