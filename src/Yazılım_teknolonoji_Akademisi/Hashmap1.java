package Yazılım_teknolonoji_Akademisi;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        //Hashmap sınıfı
        //key-> Value
        // Keyden bir tane olur
        //araba anahtar örneği yedek anahtar
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

        hashmap.put("Ali", 57);
        hashmap.put("Veli", 78);
        hashmap.put("Osman", 62);
        hashmap.put("Zeynep", 78);

        for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
            String isim=entry.getKey();
            Integer not=entry.getValue();
            System.out.println(isim   +" isimli öğrencinin notu "+ not);

        }


        System.out.println(hashmap.get(78));
        System.out.println( hashmap.get("Zeynep"));// get direk değerleri getiriyor
        //çok boş şeye kafayı takıyorsun
    }
}
