package day30_Immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*

        String mi yoksa StringBuilder mi daha hızllıdrr
        bunun için bir string oluşturup 1000 kere sonuna .
        ekleyelim öncesinde ve sonrasında zamanı alıp aradaki farki bulalım


      */
        LocalTime baslangic = LocalTime.now();
        String str="Ahhhh Javav";
        for (int i = 0; i <1000; i++){
    str+=" . ";


        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman :"+(bitis.getNano()- baslangic.getNano()));



    }
}
