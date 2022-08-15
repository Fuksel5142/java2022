package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        Java Entry<K,V> map in içerisinde bulunan her bir kaydı
        K=V Şeklinde tutar
        dolayısıyla herhangi bir Entry 'e ulaştığımızda
        hem key' e hem de value' ya ulaşabilir ve istedğimiz işlemleri yapabiliriz

        entry.getkey() bize key i getirir
        entry.getvalue() bize value i getir
        entry.setValue() value'yu istedigimiz deger olarak update eder
         */
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        // map in her bir elemanı alt alta yazdırın

        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            System.out.println(each);

        }

        // Map in tüm elemanlarında varsa Tester kurs ismini QA olarak değiştirelim
        String eachValue;

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester", "QA");
            each.setValue(eachValue);



        }
        System.out.println(sinifListMap);

    }
}
