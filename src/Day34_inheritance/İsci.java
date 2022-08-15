package Day34_inheritance;

public class İsci extends personel{
    /*
    Normal hayatımızda parent cocuk sahibi olmaya karar verebilir
    Java da ise child classlar özelliklerini inherit etmek istedikleri
    class i kendileriyle parent edinirler

    mesela isci class ini oluşturunca nelere ihtiyacı var diye düşünsek
    Personel class ındaki tüm variable ve method lara ihtiyacı
    olduğunu görebiliriz
    Bu durumda yeniden o varable ve method ları oluşturmak yerine
    Personel Class ını kendimize parnt ediniriz

    Bir class i parent edinmek için extends kewyword kullanmalyız

   bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere (variable + method) otomatik olarak sahip olur
    2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- Parent class'da olmayan bazi yeni ozellikler olusturabilir
    not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir

     */

    int persNo=1001; // evinde şeker varken babaı kullanma
    public static void main(String[] args) {
        İsci isci1=new İsci();
        System.out.println(isci1.isim);
        // kendi class ımızda isim variable yok, onun için parente gideriz
        isci1.isim="Selim";
        System.out.println(isci1.persNo);
        isci1.maas();  // Isciler minumum 15 euro satt ucreti alır
    }

    public void maas(){
        System.out.println("Isciler minumum 15 euro satt ucreti alır");
    }

}
