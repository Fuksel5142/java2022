package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maasIscı(){
        System.out.println("İşçiler : " + (30*saatUcreti+gunlukMesai));
    }
    protected void ozelSigortaIscı(){
        System.out.println("İşçiler %70 indirimli özel sigorta yaptırabilir");
    }

    public static void main(String[] args) {
        BMuhasebe ıscı=new DIsci();
        /*
        bir  obje oluştururken data türü ve constructor
        Aynı class dan ise direk o classa gidiyorduk

        eğer datatürü ve constructor farklı ise
        Öncelikle datatürünün olduğu classa gideriz
        ancak, bizden istenen işçi classındaki spsifik özellikler
        değil bir işçinin muhasebe classındaki tüm çalışanlarla
        beraber sahip olduğu genel özelikleri yazdırır.
        // isçinin muhasebe classındaki tüm hakları

         */

        System.out.println(ıscı.gunlukMesai); //  M 8
        System.out.println(ıscı.saatUcreti); // M 10
        ıscı.maas(); // M
        ıscı.ozelSigorta(); // M
        ıscı.sigorta(); // M
        System.out.println(ıscı.isim); // P
        System.out.println(ıscı.soyisim); //P
        System.out.println(ıscı.departmant);//P

        APersonel isc2 = new DIsci();
        //System.out.println(isc2.gunlukMesai); // M 8
        //System.out.println(isc2.saatUcreti); // M 10
        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departmant);// P
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */
        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */
}}
