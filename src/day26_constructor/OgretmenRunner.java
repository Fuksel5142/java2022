


package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("ogretmen 1 " + ogretmen1);
        Ogretmen ogretmen2=new Ogretmen("Emre","Akdoğan","1/1/2001" ,"Matematik", "Fizik");
        System.out.println("ogretmen 2 " + ogretmen2);
        Ogretmen ogretmen3=new Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println("ogretmen 3 " + ogretmen3);



    }
}
