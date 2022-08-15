package Yazılım_teknolonoji_Akademisi;

public class Main {
    public static void main(String[] args) {


        Otomobil otomobil1 = new Otomobil();// ilk otomobili ürettik
        otomobil1.setRenk  ("Yesil");
        otomobil1.setJant("Celik");

        System.out.println(otomobil1.getRenk()+ " "+ otomobil1.getJant() +" "+ otomobil1.getModel());
        Otomobil otomobil2 = new Otomobil();// ikinci otomobili
        otomobil2.setRenk  ("Mavi");
        otomobil2.setJant("Bakır");
        System.out.println(otomobil2.getRenk()+ " "+ otomobil2.getJant() +" "+ otomobil2.getEn());

/*
encapsuation prensibi derki classınızın değişebilen özelliklerine sakın ha sakın o sınıfa ait
başka class lardan değiştirmyin sen bunları methodla değiştir der
 */
    }
}
