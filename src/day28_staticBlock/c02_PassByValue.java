package day28_staticBlock;

public class c02_PassByValue {
    public static void main(String[] args) {
        double satisfiyatı=100;
        System.out.println(indirimliFiiyat(satisfiyatı));
        System.out.println(satisfiyatı);


        System.out.println(indirimliFiiyat(satisfiyatı));
        // iki farklı metotda satısfiyatı isminde variable olabilir
        // java buna itiraz etmez çünkü scopeları farklıdır

    }

    public static double indirimliFiiyat(double orjinalfiyat) {
        // methodumuz %10 indirim yapip
        // yeni fiyatı main methoddan döndürsün
        double satisfiyatıİ=orjinalfiyat*0.9;
       // System.out.println(satisfiyatı); statik yazdırma işi hangisinde ise statik statikden alır ama yazdırmaz

        return orjinalfiyat*0.9;


    }

}
