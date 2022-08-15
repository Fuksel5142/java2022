package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int arr[]={52,5,-9,45,43,11,8,102,10,47,0};
        int n=4;
        List<Integer> list=new ArrayList<Integer>();
        for (int each:arr) {
            list.add(each);// çok metot olması list içiçn

        } List<Integer> maxlist = new ArrayList<Integer>();
            int count = 1;
        int max=list.get(0);

            while (count<=n){
               // böyle sorularda herhangi bir getside olur önmeli olan döndürmesi
                // ama sen yine list şle ya da farketmez ilk elementi baz al
                for (int i=0;i<list.size(); i++) {// for i de list arrayi yazdırıken size
                    if (list.get(i) > max && !(maxlist.contains(list.get(i)))) {// 2.de bir defa yer alıyor
                        // hali ile yer almıyorsa bir defa ekliyor
                        max=list.get(i);// max artik o eleman olsun
                    }
                }
                maxlist.add(max);
               // list.remove(list.indexOf(max));
                count++;


            }
            System.out.println("Array in max " + n +" elemani " + maxlist);

    }

    }

