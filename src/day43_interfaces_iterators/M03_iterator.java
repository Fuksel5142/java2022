package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        //liste deki tüm elementleri İNDEX KULLANMADAN 3 ARTIRIN
        for (int each:liste){
            each+=3;
            System.out.print(each + " ");

        }
        System.out.println("");
        System.out.println(liste);

        /*
        Java index yapısı olmayan collectionlardaki
        elementlere ulaşmak veya dğiştirmek için
        Iterator interface ını oluşturmuştur

        Iterator interface olduğundan ondan obje üretmemiz mümkün değildir
        bunun yerine bize iterator döndüren liste.Iterator metodunu kullanıyoruz
         */
        System.out.println(liste);//10,20,30
        Iterator it1=liste.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());// artık 30dan sonra elemenet kalmadığından  next()RTE verir

        // İTERATOR DA GERİ DÖNÜŞ YOK ADIM ADIM SONA ULAŞTIKTAN SONRA
        //başa gelmek isterseniz yeniden bir iterator oluşturmanız gerekir

        Iterator it2=liste.iterator();
        // yeni it2 yi kullanarak listenin tüm elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);// itertor ile elementleri gezip,remove yapınca
        // kiste kalıcı olarak değişir

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);
        Iterator it3=liste.iterator();
        while(it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop dan sonra liste");

        /*
        Görüldüğü gibi iterator kullanarak
        1-tüm collectionu yazdırak
        2- tüm collection elementlerini silmek
        bu da bize yetmez
         */




    }
}
