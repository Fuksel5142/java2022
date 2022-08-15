package day31_timeformater_varags;

public class C05_VarargsParametreİleKullanme {
    public static void main(String[] args) {
        enuzunKelimeyiYazdır(5,"Ayse,Ismail","Ahmet");
        /*
        Varargs teorik olarak sonsuz sayıda element alabilir
        bir method da parametre olarak varargs varsa
        varargsin sınırlarını bilebilmesi için parametrelerin sonuncusu
        olamlıdır
        öncesinde farklı parametre olabilir ama varargs dan sonra parametre olamaz
        bu kuraldan ötürü bir method da sadece bir tane varargs olabilir
        önce olacak noltadan
         */
    }

    public static void enuzunKelimeyiYazdır(int kelimesayisi, String... kelime) {
        String enuzunKelime=kelime[0];// ilk elelmente en uzun max varargs Array tabanli oldugu icin degilmi
        // list olsa idi size derdik
        for (String each : kelime){
            if (each.length()>enuzunKelime.length()){
                enuzunKelime=each;
            }


        }
        System.out.println("Girilen kelimenin length : " + enuzunKelime);
    }
}
