package day46_maps;

import java.util.*;

public class ReusableMethods {
    public static Map<Integer, String> mapOlustur() {
        Map<Integer, String> sinifMap = new HashMap<>();// key  int

        sinifMap.put(101, "Ali, Can, JDev");// boşluklara dikkat
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Dera, Denz, Tester");

        return sinifMap;


    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each : ogrenciMap.values()) {
            System.out.println(sira + " - " + each);
            sira++;


        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakilist = new ArrayList<String>();
        String[] eachArr;

        for (String each : ogrenciMap.values()) {
            eachArr = each.split(",");
            methoddakilist.add(eachArr[0] + " " + eachArr[1]);

        }
        return methoddakilist;
    }

    public static void bransOgrencisayisiYazdir(Map<Integer, String> sinifListMap) {
        // brans=bransdakiOgrenciSayisi
        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();
        Collection<String> valuesCollection = sinifListMap.values();
        String[] valueArr;
        String brans;
        Integer bransdakiOgrSayisi;
        for (String each : valuesCollection
        ) {
            valueArr = each.split(", ");
            brans = valueArr[2];
            // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini
            // kontrol etmeliyiz

            System.out.println("ww" + brans);
            if (!bransOgrSayiMap.containsKey(brans)) {
                bransOgrSayiMap.put(brans, 1);
            } else {
                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);
                /*
                get ile map içerisine bransları alıyorum
                 */
                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);

            }
        }
        System.out.println();

        System.out.println("dad" + bransOgrSayiMap);
    }
    public static void entryYazdir(Map<Integer, String> sinifListMap) {
        Set<Map.Entry<Integer,String>> sinifListEntrySeti= sinifListMap.entrySet();
        for (Map.Entry<Integer,String> entry: sinifListEntrySeti
        ) {
            System.out.println(entry);
        }
    }
}

