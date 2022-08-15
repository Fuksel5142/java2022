package day11_stringManipulatıon;

public class C06_Endwıth {

    public static void main(String[] args) {
        /* soru 1) kullanıcıdan email adresini girmesini isteyin,
        mail @gmail.com içermiyorsa  "Lütfen gmail adresi giriniz"
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"  ,
        @gmail.com ile bitmiyorsa  lutfen yazımı kontrol edin yazdırın
         */

        String input= " fatih@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");

        }else{
            System.out.println("Lutfen yazımı kontrol edin" );
        }


    }
}
