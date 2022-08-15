package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = ReusableMethods.mapOlustur();

        //value'ları sıra numaralı olarak yazdırın
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // isim ve soyisimlerin birlikte olacağı liste oluşturun
        List<String> sinifisimsoyisimlist=ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim  soyisim listesi :"+sinifisimsoyisimlist);

        // kaç farklı  brans varsa bransismi: branstakiögrenci sayısı seklinde yazdırın
    }
}
