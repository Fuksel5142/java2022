package Day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        // kullanıcıdan ismini isteyin girilen isminiz
        // girilen ismi
        // isminiz: ismail şeklinde yazdırın
        // insanların dünyasından kod larımızın bulunduğu class' adeğer almak için
        // Scanner class'ını kullanırız

        // 1- scanner objesini oluşturalım
        Scanner scan =new Scanner(System.in);

        //2. adım kullanucuya ne istediğimizi söyleyelim
        System.out.println("lütfen isminizi giriniz");

        // 3.  adım oluşturduğumuz scan objesi ile kullanıcının girdiği
        //değeri alıp oluşturacağımız variable a atayalım

        String kullaniciİsmi=scan.next();

        System.out.println("İsminiz: " + kullaniciİsmi);

    }
}
