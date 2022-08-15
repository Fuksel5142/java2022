package day15_overloadingfoorlop;

public class C07_Foorlop {

    public static void main(String[] args) {

        C06_Stringterseçecirme.terstenYazdir("Zekeriya");

        // 100 den 1 e kadar (sınırlar dahil) 8 ile bölünebilen sayıları yazdırın

        for (int i =100; i >1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }

        }
    }
}
