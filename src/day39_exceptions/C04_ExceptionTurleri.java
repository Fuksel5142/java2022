package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;

        /*System.out.println(str);

        System.out.printlb(str);
        değer ataması yapmadan bir variable i kullanmaya çakışırsanız
        Java Complie Time dan bunu farkeder ve size izi vermez
         */
        str=null;
        //System.out.println(str.length());
        // NullPointerException

        Object obj = "Java Java Java";
        Integer sayi=(Integer)obj;

        /*String str2 = "Hava CCiva";
        Integer sayi2=str2;
        java bazı casting işlemlerine complie time da izizn vermez

        Ancak Bazen syntax uygun olabilir
        bu durumda java kodub çalışmasına itiraz etmez

         */



    }
}
