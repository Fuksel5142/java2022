package recap;

public class Q07_Stringmanipulation {

    public static void main(String[] args) {

        // String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz
        // String str 1 = "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        /* Regular Expression(regex) : Belli türdeki characterleri seçebilmemize yarar.
        1) \\d tüm rakamlar
           \\ D tüm rakam dışı characterler
           */
         String str1 = "$13.99";
         str1=str1.replaceAll("\\D", "");
        System.out.println("str1 = "+ str1);

        String str2= "$10.55";
        str2=str2.replaceAll("\\D", "");
        System.out.println("str2 ="+ str2);
        System.out.println(str1+str2);

        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);
        double toplam=(sayi1+sayi2/100);
        System.out.println("$ " + toplam);
    }
}
