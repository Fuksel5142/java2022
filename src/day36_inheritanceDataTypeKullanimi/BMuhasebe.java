package day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel {
    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Personel minimum :"+(30*gunlukMesai*saatUcreti));
    }
    protected void ozelSigorta(){
        System.out.println("İsteyen calısanlara %50 indirimli özel sigorta yapılır");
    }


}
