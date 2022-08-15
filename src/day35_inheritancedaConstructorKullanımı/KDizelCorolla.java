package day35_inheritancedaConstructorKullanımı;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla (){
        System.out.println("Personeş parametresiz costructor");
    }

    KDizelCorolla (String isim){
        super(isim); // kendimiz yazdığımız için java siler

        System.out.println("Personeş parametreli costructor");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1 = new KDizelCorolla("Hasan");
    }

}
