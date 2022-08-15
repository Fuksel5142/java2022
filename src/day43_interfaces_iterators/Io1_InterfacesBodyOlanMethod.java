package day43_interfaces_iterators;

public interface Io1_InterfacesBodyOlanMethod {
    void motor();
    public void yakıt();
    public abstract String aku();
    /*
    nırmalbir class da olduğumuzu düşünürsek iki tane acces modifier kullanma
    ihtimali yoktur

    aşağıdaki method da göreceğiniz gibi
    İnterface de istismai olarak body si olan methodlar oluşturulabilir
    Bu özellikten önce Java 8 den sonra  bir interface de yeni
    bir method eklememeiz gerektiğinde eskiden beri bu interface i implement eden
    tüm classl ara gidip yeni eklenen methodu override etmemeiz gerekirdi

    bu özellik sayesinde başına default veya statik keyword ekleyerek
    interface de yeni ve bodysi olan bir method oluşturursak bu meyhodun
    child classlar tarafından override edilme mecburiyeti olmaz
    ve eskiden implement etmiş classları değiştirmemeiz gerekmez
    Bu isttisnai bir durumdur ve interface için oluşturulan
    genel kuralları bozmaz

    Bu methodların body si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur

    Buradaki default kelimesi acces modifier değil
    istisnai durumun belirtilmesi içindir
    o zaman niçin 2 keyword( static ve default) tanımlanmıştır
    bu iki farklı kelimenin amacı
    child class lardan bu method a nasıl erişilebileceğini belirlemek içindir
    static keyword kullanılırsa child class dan bu method a erişmek için
    İnterfaceAdi.methodadı yeterli olur
    default keyword kullanılırsa,methoda erişmek  çin obje oluşturulmalıdır

     */
    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("Tum arabalarin direksiyonu vardir");
    }

}
