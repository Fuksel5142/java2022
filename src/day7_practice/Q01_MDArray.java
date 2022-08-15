package day7_practice;

public class Q01_MDArray {
    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D - Dimensional arrayinden min number print et
     * multidimensial arraylarde içerdeki elelmana ulaşmanın bir yolu for döngisi kullanmak
     * sonra bu elemanları birbirleri ile karşılaştırıp minumumu bulacaz
     * istersek her bir arrayin boyutunu da for ddögüsü ile yazdırabiliriz
     * istersek sout ile tanımlayıp tek tek yaparız
     *
     */
    public static void main(String[] args) {
        int arr[][] = {{-4, 2, 3}, {2, 3, 4}, {5, 5, 5}, {2,  -3}};
        int min = arr[0][0]; // 6..
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" +i+ "].length i : " + arr[i].length);
            //forun altına sout her defasında yazdırır.
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j]<min){  ///5.
                    min = arr[i][j];
                
            }
                
            }
        }
        System.out.println("min = " + min);

    }

}
