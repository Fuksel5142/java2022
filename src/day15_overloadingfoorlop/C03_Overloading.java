package day15_overloadingfoorlop;

public class C03_Overloading {

    public static void main(String[] args) {
        // 1 den 5 e kadar olan tamsayıları toplayalım

        int toplam=0;
        for (int i = 1; i <=5 ; i++) {

            toplam+=i;

        }
        System.out.println("toplam : " + toplam);

        // 10 dahil - 20 dahil aradaki sayıları toplayın
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println("10-20 arası toplam : " + toplam);

        // 30 dahil 50 dahil aradaki çift sayıları toplayın
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;

        }
        System.out.println("30-50 arası çift sayıların toplam : " + toplam);
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arası çift sayıların toplam : " + toplam);

        // 1500 ile 1600 ( sınırlar dahil) arasında 7 ile bölünebilen sayıları toplayın
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }

        }
        System.out.println("1500-1600 arası yedi ile bölünebilen sayıların toplam : " + toplam);
    }







}



