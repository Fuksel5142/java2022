package recap;

public class Q11_StringMan {
    /*
    name1 ve name2 değişkenlerini oluşturun.
    name 1 değişkeninin karakter sayısı çift ise kelimenin ortasına name 2 yi yerleştirin
    name1 değişkeninin karakter sayısı tek ise "name1 cift sayılı olmadığı için ortasına yerleştiremedik"
    yazdırın
    name1= mehmet
    name2 =ahmet
    print   mehahmetmet
     */
    public static void main(String[] args) {
         String name1= "mehmet";
         String name2= "ahmet";

         if (name1.length()%2==0){
             System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
         }else System.out.println("cift sayı olmadığı için ortasına yerleştiremedik");
    }
}
