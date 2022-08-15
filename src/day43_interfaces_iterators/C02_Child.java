package day43_interfaces_iterators;

public class C02_Child implements Io1_InterfacesBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakıt() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface de abstract olan 3 methodu implement ettiğimizde
    java itirazı durdurur
    sonradan eklediğimiz default veya static keyword ile tanımladığımız
    methodları implement etmememiz sorun oluşturmadı

     O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
     Bu iki farkli kelimenin amaci
     child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
     static keyword kullanilirsa , child class'dan bu method'a erismek icin
     InterfaceAdi.methodAdi yeterli olur
    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
    interface in cons u yoktur


     */
    public static void main(String[] args) {
        Io1_InterfacesBodyOlanMethod.direksiyon();
        C02_Child obj= new C02_Child();
        obj.teker();
        // main metod dışında obje olmaz
    }
}
