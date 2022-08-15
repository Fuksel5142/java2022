package day46_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ben {

    public static void main(String[] args) {
        Map<Integer, String> map1=ReusableMethods.mapOlustur();
        System.out.println(map1);

        Collection<String> valuesCollection = map1.values();
        HashMap<String, Integer> map3=new HashMap<String, Integer>();
        String[] valueArr;
        String brans;
        Integer bransdakiOgrSayisi;

        for (String  each:valuesCollection) {
            valueArr = each.split(", ");
            brans = valueArr[2];

            if (!map3.containsKey(brans)){
                map3.put(brans, 1);

            }else{
                bransdakiOgrSayisi = map3.get(brans);
                map3.put(brans, ++bransdakiOgrSayisi);
            }

        }

        System.out.println(map3);
              {

        }
    }
}
