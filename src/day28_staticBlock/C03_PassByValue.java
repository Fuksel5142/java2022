package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %60 inidirinli fiyatı hesaplayıp bize döndiren etoto oluşturun



         */
        double satisfiyatı=100;
        double indirimorani=60;

        double inidirinlifiyat= inidirinlifiyathesapla(satisfiyatı,indirimorani);
        // ben indirimlifiyat hesapla metota satış fiyyatını gönderecem o da
        // indirimli fiyatı hesaplayıp bana geri gönderecekl
        System.out.println("İndirimli fiyat :" +inidirinlifiyat);
        System.out.println(satisfiyatı);
    }

    public static double inidirinlifiyathesapla(double satisfiyatı,double indirimorani) { // deklere edilmiş
        // java satış fiyatına oluşturulan metotta variableı geçiremez ama değeri geçirir
        // yani adı  satış fiyatı ama değerleri kopyasını gönderiri
        // satısfiyatı yerine xyz de yazarız farklı metot ve constructorları erişmek için
        // kod taakibi anlamak için
        double inidirinlifiyat=satisfiyatı*(1-indirimorani/100);
        return inidirinlifiyat; // eğer sout olmazsa return çevirmez
    }
}
