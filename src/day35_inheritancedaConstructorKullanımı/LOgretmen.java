package day35_inheritancedaConstructorKullanımı;

public class LOgretmen {
    LOgretmen(){
        System.out.println("LOgretmen parametresiz constrructor");
    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli constrructor");
    }

}

