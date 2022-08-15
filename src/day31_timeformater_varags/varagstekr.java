package day31_timeformater_varags;

public class varagstekr {
    public static void main(String[] args) {
        enuzunkelimeyiyazdie("Ali","Ahmet","Ayse");
    }

    private static void enuzunkelimeyiyazdie(String...Kelime) {
        String enuzunkelime=Kelime[0];
        for (String each:Kelime) {
            if (each.length() > enuzunkelime.length()) {
                enuzunkelime=each;

            }

        }
        System.out.println("enuzunkelime = " + enuzunkelime);

    }
}
