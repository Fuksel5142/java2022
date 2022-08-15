package Yazılım_teknolonoji_Akademisi;

import java.util.HashMap;

public class HashMapUygulama {

    public static String tekrarlayankarakterbul(String s) {

        HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
        for (int i = 0; i <s.length() ; i++) {//traverse
            String karakter=s.substring(i,i+1);// => i=0 için karakter A, i01 için karakter = B,
            if(!hashmap.containsKey(karakter))

                hashmap.put(karakter, 1);
        else
                return karakter;
        }
        return s;
    }


    public static void main(String[] args) {
        //
        // Hashmaps google, facebook mülakat sorusu
        // SOsorular algoritma ve data structure ağırlıklı
        //tekrar eden elamanı return eden

        String s="ABCCD";
        System.out.println(tekrarlayankarakterbul(s));
    }
}
