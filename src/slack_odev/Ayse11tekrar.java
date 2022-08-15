package slack_odev;

public class Ayse11tekrar {
    public static void main(String[] args) {
        int [] arr={2, 55, 60, 97, 86};
        System.out.println(yedirakaminibul(arr));
    }
    public static String yedirakaminibul(int[] arr) {
        String yediVarmi="";
        int birlerBasamagi=0;
        int onlarbasamaği=0;
        for (int i = 0; i <arr.length; i++) {
            birlerBasamagi=arr[i] % 10;
           // System.out.println("Birlerbasamağı: "+birlerbasamağı);
            onlarbasamaği=arr[i] /=10;
           // System.out.println("Onlarbasamaği: "+onlarbasamaği);
            if(arr[i]==7 || birlerBasamagi == 7 || onlarbasamaği == 7) {
                yediVarmi="Boom!";
                break;
            }else{
                yediVarmi="dizide yedi rakamı yok";
            }
        }
        return yediVarmi;
    }
    }

