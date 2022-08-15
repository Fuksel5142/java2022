package day8_practice;

import java.util.Random;

public class JavaMathClassMethods {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;
        System.out.println("a nın mutlak değeri= " + Math.abs(a));
        System.out.println("a ve b nden en büyük olanımutlak değeri = " + Math.max(a, b));
        System.out.println("2,6,8 den en büyük olanı=" + Math.max(2, Math.max(6, 8)));
        System.out.println("A ve B den en küçük olanı = " + Math.min(a, b));
        System.out.println("B nin karekodu = " + Math.sqrt(b));
        System.out.println("2 nin 3 kuvveti = " + Math.pow(2, 3));
        System.out.println("round 3.1 i yuvarla = " + Math.round(3.1)); // 3
        System.out.println("round 3.5 i yuvarla = " + Math.round(3.5)); // 4
        System.out.println("3.1 sayisinin ust tamsayiya yuvarlama = " + Math.ceil(3.1)); // 4 -> tavan
        System.out.println("3.5 sayisinin ust tamsayiya yuvarlama = " + Math.ceil(3.5)); // 4
        System.out.println("3.1 sayisinin alt tamsayiya yuvarlama = " + Math.floor(3.1)); // 3 -> taban
        System.out.println("3.5 sayisinin alt tamsayiya yuvarlama = " + Math.floor(3.5)); // 3

        // Math random() : double veri tipine sahip olarak algılar ve0 -1 arasında rastgele sayı üretir
        // random metodu ile sayı üretme
        double doublesayi=Math.random()*100;
        System.out.println("double sayi :"+doublesayi);
        //int değerler üretme
        int intsayi= (int) (Math.random() * 100);
        System.out.println("intsayi :"+intsayi);
        int max = 20;
        int x = (int)(Math.random()*max);
        int y = (int)(Math.random()*max);
        System.out.println("x value is " + x);
        System.out.println("y value is " + y);
        if(x<y)
            System.out.println(x + " is the minimum number");
        else
            System.out.println(y + " is the minimum number");
        // Java Math.Random Kullanimi
        for(int adet = 0; adet< 10; adet++){
            System.out.println("Java Math.Random Sayi: " + Math.random());
        }
        // java until.random kullanımı
        Random rnd=new Random();
        for (int i = 0; i <10 ; i++) {
            int rSayi=rnd.nextInt(100);
            System.out.println("java.util.Random Sayi : " + rSayi);
            
        }

    }

}
