package day6_practice;

import java.util.Arrays;

public class Q06_Arrays {
    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */
    public static void main(String[] args) {
        String str = "HeySiri";
        str = str.replace("Hey","Bye");
        System.out.println("str = " + str);
        String[] arr = new String[1];  // bu 1 bunun lenghti veriyor
        arr [0] = str;  // bu sıfırda indexi veriyor
        System.out.println("arr = " + Arrays.toString(arr));

    }
}
