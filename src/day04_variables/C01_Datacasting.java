package day04_variables;

public class C01_Datacasting {

    public static void main(String[] args) {

        char harf='a';
        char yeniharf=(char)(harf+1);   // kod bu durumda önce sağdaki işlemi yapar
                                // char yeniharf = 97+1,=98
                                // chare bir variable 98 olamayacağı için java hata veriri
        System.out.println(yeniharf);

        /*
        bazen bir variable a oluşturulduğu data türünden değer atanabilir
        bunlardan bazısını java otomatik kabul eder

         */
        int sayi1=(int)7.3;
        System.out.println("sayi1 :"+ sayi1);
        double sayi2=10;
        System.out.println("sayi2 :"+ sayi2);   //  10,0

        int sayi3='c';
        System.out.println("sayi3 :" + sayi3);   //  99
        char harf2= 98;
        System.out.println("harf2 :"+  harf2);    //  b

    }
}
