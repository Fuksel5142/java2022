package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q08_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     * main
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {// bu olay en fazla bir ekler
              //  çünkü içermiyorsa bir ekler//
                list.add(arr[i]);

            }

        }

        Collections.sort(list);//sort() methodu ArrayList’deki elemanlari
       // kucukten buyuge veya alfabetik siraya gore dizer.
        System.out.println(list);

        Object [] yeniArray = list.toArray();// array listi yeni array yapmak için
        System.out.println("yeni array : " + Arrays.toString(yeniArray));

    }
}
