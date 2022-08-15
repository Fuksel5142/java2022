package day31_timeformater_varags;

public class C04_VaragsİleEnUzunKelimeyiYazdırma {
    public static void main(String[] args) {
        enuzunKelimeyiYazdır("Ali,Ayse,Ismail","Ahmet");
    }

    public static void enuzunKelimeyiYazdır(String... kelime) {
        String enuzunKelime=kelime[0];// ilk elelmente en uzun max varargs Array tabanli oldugu icin
        // list olsa idi size derdik
        for (String each : kelime){
            if (each.length()>enuzunKelime.length()){
                enuzunKelime=each;
            }


        }
        System.out.println("Girilen kelimenin length : " + enuzunKelime);
    }
}
