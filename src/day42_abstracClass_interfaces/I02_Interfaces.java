package day42_abstracClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {

    int SAYİ=30;
    /*
    İnterface bir class değildir
    Abstract class  lar java da abstraction(soyutlastırma/kural koyma)
    işlevini yapıyordu
    Ancak abstract bir class da abstract olmayan method lar olabilir
    bu da full abstraction yapmaya izin vermez

    Eğer java da içinde hiç concrete method olmasın
    dediğimiz bir class oluştumak istiyorsanız
    bunu class değil interface yapmalısınız

    İnterface lerde concrete method olmaz
    İnterface'lar full abstraction yaptığından Interface lerden obje oluşturulmaz
    3- class larda bir child birden fazla parent edinemez
    Ancsk İnterface lerde concrete  olmadığından biz her methodu
    child class ından override etmek zorundayız
    Override ederken kimn söylediğni override ettiğmizin önemi yok

   // hatırrladığınız gibi ınterface olan list den direk obje oluşturamıyorduk
    //bunun yerine constructor ı list in childiolan arraylist den seceriz

    4-interface ler neyin yapılması gerektiğini söyler ama nasıl yapılacağina karışmaz

     */
    List<String> liste=new ArrayList<>();
}
