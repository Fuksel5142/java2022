package day36_inheritanceDataTypeKullanimi;

public class APersonel {
    String isim="İsşm belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String departmant ="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tüm personelimiz maas alır");
    }
    protected  void sigorta(){
        System.out.println("Tüm personelimiz sigortalıdır");

    }
}
