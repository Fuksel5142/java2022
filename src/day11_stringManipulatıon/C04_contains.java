package day11_stringManipulatıon;

public class C04_contains {

    public static void main(String[] args) {

        /*  kullanıcıdan bir cümle isteyin.
        cumle "buyuk" kelimesi içeriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi içeriyorsa tum cumleyi kucuk harf olarak yazdırın,
        iki kelimeyi de içermiyorsa "Cumle kucuk yada buyuk kelimesi içermiyor" yazdırın.

         */

        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();
        // requirements de buyuk harf kucuk harf hassasiyeti hakkında bir sey soylenmemis
        // ikinci olarak da her iki kelimeyi de icerme durumu acıklanmamıs
        // bu durumda gorevi bize kim verdi ise ona sormak lazım

        // ek requirements : ikisini de içeriyorsa "Karar ver buyuk mu yazdırayım, kucuk mu?"
        // case sensitive olmasın

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("Karar ver buyuk mu yazdırayım, kucuk mu ?");

        }else{
            System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor");
        }


    }
}
