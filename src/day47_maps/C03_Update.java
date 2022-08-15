package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key) ==> verdiğimiz  keyin map de olup olmadığını booelan olarak kontrol eder
        map.contains(value) ==> bir bütün olarak value nin map de olup olmadığını kontrol eder

        Onmeli Not: map.contaibs(value) ==> value nin içindeki bir parçayı bulmaya yaramaz
        eğer value içindeki bir parçayı aratmak istiyorsak
        map üzerindeki manipılation yapmamaız lazım

        map.get(key) ==> verilen key e ait değeri döndürür
         */

        Map<Integer, String> siniflistmap= ReusableMethods.mapOlustur();

        System.out.println(siniflistmap.containsKey(104));

        System.out.println(siniflistmap.containsKey(114));// false

        System.out.println(siniflistmap.containsValue("Ali, Can, Jdev"));

        System.out.println(siniflistmap.containsValue("Jdev"));

        //Verilen map de Jdev değerini JavaDeveloper olarak değiştirelim
        // Map'lerde replace tüm value yi değiştirmek istersek kullanılabiir
        // kısmi değişiklerde kullanmalıyız

        ReusableMethods.tumValueSiraliYazdir(siniflistmap);

        //Mapi güncellmek için key, yenideğeri map e eklemeliyiz
        //örneğin key 101 için value Ali,Can;Jdev
        //güncelleme için siniflistmap.put(101,Ali , Can, Javadeveoloer)

        // bunu yapabilmek için her bir key ' e ve ona  ait value ya ihtiyacım var

        Set<Integer> keySeti=siniflistmap.keySet();
        String eachValue;

        for (int each:keySeti
             ) {
           eachValue= siniflistmap.get(each);
           eachValue=eachValue.replace("JDev", "Javadeveoloer");
           siniflistmap.put(each, eachValue);

        }
        System.out.println(siniflistmap);
        /*
        Biz keylerin tamamını aldık her bir keyin valuesini getirdik
        value üzerinde değişikliği yapıp yeni halini put(key, yenideğer)
        ile map e koyduk
         */




    }
}
