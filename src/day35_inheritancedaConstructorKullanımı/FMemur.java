package day35_inheritancedaConstructorKullanımı;

public class FMemur  extends EMuhasebe{

    /*
    extend keyword kullanım classlarda
    ister default constructor bulunsun
    istersek de biz yeni constructorlar oluşturalım
    java constructorın ilk satırına
    super() constructor call yazar

    super() constructor call default constructora benzer
    görünmese orada vardır ve çalışır ancak biz ilk satıra farklı bir cobstructor call
    yazarsak java super () constructor ı siler

    Eğer biz müdahale edip kendi Constructor call ı oluşturmazsak
    javanın kendi oluşturduğu kol her zaman parametresizdir
     */
    FMemur() {
        System.out.println("memur parametresiz consteuctor");
    }

    FMemur(String isim){
        System.out.println("memur parametreli consteuctor");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur("ali");
}}
