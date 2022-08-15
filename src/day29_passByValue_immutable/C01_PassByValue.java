package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanlı bir array oluşturalım
        sonra ayrı bir methodda
        bu arrayin 2. ve 4. elemanlarını
        100'den küçük rastgele bir sayı ile değiştitelim
         */

        int[] arr={5,7,8,10};

        elelmandegistir(arr); // array de creation  böyle

        System.out.println("main methodun içinde diğer method çalıştıktan sonra :"+Arrays.toString(arr));
        // return yapınca da aynısı gelir
    }

    public static void elelmandegistir(int[] arr) {

        Random rnd=new Random();
        arr[1] = rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr)); //[5, 45, 8, 39]


    }
}
