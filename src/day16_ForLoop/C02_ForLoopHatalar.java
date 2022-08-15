package day16_ForLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        // baslangıc noktasından sonra
        // bitis sartına yaklasmıyorsak sonsuz loop oluşur


      /*
        for (int i = 0; i > -10; i++) {


            System.out.println(i);
        }


       */


        // eger ilk deger icin bile bitis sarti saglanmiyorsa
        // for loop calisir
        // ama loop body'si hicbir zaman devreye girmez(calismaz)

        for (int i = 0; i >5 ; i++) {
            System.out.println(i);
        }
    }
}