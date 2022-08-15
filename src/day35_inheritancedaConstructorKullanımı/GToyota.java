package day35_inheritancedaConstructorKullanımı;

public class GToyota{

    GToyota (){
        System.out.println("Gtoyota parametresiz costructor");
    }

   GToyota (String isim){
       // extends olmadığı için süper constructor kolu java kabul etmez super(isim);
        System.out.println("Gtoyota parametreli costructor");
    }
}
