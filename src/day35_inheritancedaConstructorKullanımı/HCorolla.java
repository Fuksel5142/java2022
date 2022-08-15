package day35_inheritancedaConstructorKullanımı;

public class HCorolla extends  GToyota {
    HCorolla (){
        System.out.println("HCorollla parametresiz costructor");
    }

    HCorolla (String isim){
        super(isim);
        System.out.println("HCorolla parametreli costructor");
    }
}
