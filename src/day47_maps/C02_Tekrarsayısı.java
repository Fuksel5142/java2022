package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_Tekrarsayısı {
    public static void main(String[] args) {
        /*
        verilen bir strindeki kullanılan harfleri
        ve kullanılan harflerin tekrar sayısını
        H= 20 şeklinde yazdırın
         */

        String str="Heeeeeellllooooo Wooooooorrrrllllddddd";
        // spaceleri saymamaı için önce onları yok edelim
        str=str.replaceAll("\\W", "");

        String [] harflerArr=str.split("");

        System.out.println(Arrays.toString(harflerArr));
        //harfleri key, kullanım adedini value yaparak bir map oluşturun
        Map<String,Integer> harfKullanımsayilariMap=new HashMap<String,Integer>();
        Integer harfKullanımsayisi;

        for (String each:harflerArr)
              {
                  if (!harfKullanımsayilariMap.containsKey(each)){
                      harfKullanımsayilariMap.put(each,1);
                  }else{
                      harfKullanımsayisi=harfKullanımsayilariMap.get(each);

                      harfKullanımsayilariMap.put(each,++harfKullanımsayisi);
                  }

        }

        System.out.println(harfKullanımsayilariMap);
    }
}
