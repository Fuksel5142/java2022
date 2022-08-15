package day46_maps;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<>();// key  int

        sinifList.put(101, "Ali, Can, JDev");// boşluklara dikkat
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");

        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        //
        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]

        //tüm  öğrencilerin isim ve  soyisimlerini sıra  no ile alt alta yazdırın

        Collection<String> tümValueColl =sinifList.values();
        String [] eachArr=new String[3];
        int sira=1;

        for (String each:tümValueColl) {
            // buradaki each bize her bir öğrenciye ait
            // aynı yapıdaki isim, souisi, brans bilgilerini içeren
            //String ler getiriyor
            eachArr = each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira++;
        }

            //Map de bulunan öğrencilerin isim ve soyisimlerinin birleştirilerek
            //bir sınıf listesi oluşturun

            List<String> sinifİsimSoyisimList=new ArrayList<String>();

            for (String  each:tümValueColl)
                  {
                      eachArr=each.split(", ");
                      sinifİsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);

                      System.out.println(sinifİsimSoyisimList);


            }




    }
}
