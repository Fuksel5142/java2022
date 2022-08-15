package slack_odev;

public class evennarray {
    public static void main(String[] args) {
        Integer [] arr={6,6,7,8,4,2,1,3,1,2};
        int toplam=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2 == 0) {
                toplam += arr[i];
            }else{
                toplam-=arr[i];
            }


        } // bunun tek kolay yanı array olarak yapmak
        // diğerind stringi integera çeviiriyor
        System.out.println("toplam :  " + toplam);

        }

    }



