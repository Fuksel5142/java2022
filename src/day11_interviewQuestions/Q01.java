package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
    Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.
    Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
    hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
            */

    /*
    daha oncelikler Scannner obj olusturcaz
    onceliklr split methodu kullanicaz
    sonra sort yapcaz
    for loop a alcaz
    if ile control yapicaz ve sout ile yazdiricaz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String isim= scan.nextLine();

        String arr[]=isim.split("");

        System.out.println("arr: "+ Arrays.toString(arr));
        Arrays.sort(arr); // sortladık
        System.out.println("arr: "+Arrays.toString(arr));// arrayin sortalnamış hali
        int counter=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])){ // arrays sort
                counter++;

            }else {
                System.out.println(arr[i-1]+" karakteri "+(counter+1));
                counter=0;
            }if (i==arr.length-1){
                System.out.println(arr[i]+" karakteri "+(counter+1));
            }

        }


    }
}
