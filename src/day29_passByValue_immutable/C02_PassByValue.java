package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
          Birden fazla element iceren array ve arrayList gibi yapilarda da
          passByValue gecerlidir.
          Eger method'da array veya list'in kendisi degistirilirse
          passByValue ozelligi sebebiyle Java degisen degeri degil
          array veya list'in orijinal degerini alir
          Ancak array veya list degistirilmeden
          sadece icindeki elemanlar degistirilirse
          Java obje degismedigi icin(referans ayni),
          ayni array veya list'i bize dondurur
          ancak icindeki elementler degismis olacaktir.
         */
        /*
        birden fazla elelment içeren array ve arrays gibi yapılarda passbvalue
        geçerlidir.
        eğer method da array veya listin kendisi değiştirilirse
        passbyvalue özelliği sebebiyle
        verilen 4 elelmanlı bir arrayi
        methoda gönderelim
        methodda yeni 3 elemanlı bir array atatyıp
        bu yeni arraye rastgele 100'den küçük
        3 sayi atatyalım method da arrayi yazdıralım
        main methoda da method call den sonra yeniden methodu yazdıralım
        önceki soruda yeni arr oluşturulmadı var olna arrayin elemanları değiştirildi
        bunda ise araba yolcuları idi az önceki array


         */

        int [] arr={3,5,8,10};
        arrayiDegistir(arr);
        System.out.println("method'da call den sonra main methodda:"+ Arrays.toString(arr));
    }

    private static void arrayiDegistir(int[] arr) {
        arr=new int [3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        // arrayi methodda yazdıralım

        System.out.println("method'da array:"+ Arrays.toString(arr));


    }
}
