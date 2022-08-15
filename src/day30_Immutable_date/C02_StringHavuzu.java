package day30_Immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);
        System.out.println(str4);

        System.out.println(str1==str2);  //false
        System.out.println(str1.equals(str2)); //true

        System.out.println(str1.equals(str3)); //true içeriğe bakar
        System.out.println(str1==str3); //false

        System.out.println(str3.equals(str4)); // true
        System.out.println(str3==str4);// false
        /*
        yeni bir string oluştururken
        eşitliğin sagında new keywoor u olursa java
        direk yeni bir obje
        ve ref oluşturur

        2 eğer eşitliğin sağında bir method çalışıyor veya +
        işlemi yapıılıyorsa string immutable olduğundan değişikliği kaydetmek üzere
        hemen bir kopya string ve ref oluşturur
        sonra değeri hesaplayarak bu yeni kopya objenin içiçne koyar
         */
        String str5="Ali Can";
        String str6=str1;
        System.out.println(str1.equals(str5));// true
        System.out.println(str5==str1); //true

        System.out.println(str1.equals(str6)); //true
        System.out.println(str1==str6);  // true

        System.out.println(str5.equals(str6)); // true
        System.out.println(str5==str6);  // true
        /*
        eğer yeni string objesi oluştururken new kelimesi
        kullanılmaz veya eşitliğin sağında bir işlem olmazsa java
        bakar
        işleme girdiği anda yeni referans ve onbje olusuyo

        eğer daha önce oluşturulan String objelerden (String Havuzu)
        bire bir aynı string varsa
        o objeyi ve referansı kullanır
        bire bir aynısı yoksa yeni bir obje oluşturur

         */

    }
}
