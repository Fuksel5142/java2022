package day7_practice;

import java.util.Arrays;

public class Q02_MDArray {
    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {
        String arr[][]={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].contains("$")) {// $ işareti içeriyorsa
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    // double parseDouble ile stringi integere çevirdik ve dolarları atıp 3,2 ile çarptık
                    //double casting yaptık sayıya dönüştürdük


                } else {
                    toplam+=Double.parseDouble(arr[i][j].replace("€", ""))*4.2;
                     }
            }

        }
        System.out.println("toplam = " + toplam);
        System.out.println(Arrays.deepToString(arr));
    }
}


