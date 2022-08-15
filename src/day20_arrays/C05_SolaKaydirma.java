package day20_arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        //3 elemanlı Arrayi tüm elemanları sola kaydıracak sekilde yaz
        //Örnek : Array [1,2,3] ise output [2,3,1].
        int arr[]={1,2,3,4,5,6};
        int temp=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
        //yukarıda degisen Arrayi ilk duruma getirmek icin
        temp=arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}