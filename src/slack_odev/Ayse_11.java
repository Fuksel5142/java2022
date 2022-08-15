package slack_odev;

public class Ayse_11 {
    public static void main(String[] args) {
        Integer[] arr = {2, 55, 60, 97, 86};
        String yediRakaminiBul = yediyiBul(arr);
        System.out.println(yediRakaminiBul);
    }
    private static String yediyiBul(Integer[] arr) {
        String yediVarmi = "";
        int birlerBasamagi = 0;
        int onlarBasamagi = 0;
        for (int i = 0; i < arr.length; i++) {
            birlerBasamagi = arr[i] % 10; // 7
            // System.out.println("birlerbasamagi: "+birlerBasamagi); // Birler basamagını gormek icin yazdım
            onlarBasamagi = arr[i] /= 10;  // 9
            // System.out.println("onlarbasamagi:"+ onlarBasamagi);  // onlar basamagını gormek ıcın yazdım
            if (arr[i] == 7 || birlerBasamagi == 7 || onlarBasamagi == 7) {
                yediVarmi = "Boom!";
                break;
            } else {
                yediVarmi = "dizide 7 rakamı yok";
            }
        }
        return yediVarmi;
    }
}
