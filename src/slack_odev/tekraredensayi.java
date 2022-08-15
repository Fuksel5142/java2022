package slack_odev;

import java.util.Arrays;

public class tekraredensayi {
    /*
       1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
       2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
       3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
       Örneğin;
       ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
       ("merhaba dünya", "dünya") ➞ "merhaba"
         */
    public static void main(String[] args) {
        String str="bugün hava çok güzel";
        String cıkacakstr="çok";

        String yenistr=kelimenincıkmıshali(str, cıkacakstr);
        System.out.println("Stringi son hali: " +yenistr);
    }

    public static String kelimenincıkmıshali(String str, String cıkacakstr) {

     String yenistr="";
     String Arr[]=str.split(" ");
        System.out.println(Arrays.toString(Arr));

        for (int i = 0; i < Arr.length; i++) {

            if (!Arr[i].equalsIgnoreCase(cıkacakstr)){
                yenistr+=Arr[i]+" ";
            }
            System.out.println(Arrays.toString(Arr)); // bypassvalue

        }
        return yenistr;


    }

}
