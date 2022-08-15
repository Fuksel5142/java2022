package day15_overloadingfoorlop;

public class C08_Faktöriyel {
    public static void main(String[] args) {
        /*

    input olarak verilen bir tamsayı  için faktöryel hesaplayıp
    bir method oluşturun

    verilen sayı negatif veya 20'den büyük olursa
    "girilen sayının faktöriyeli hesaplanamaz"
    uyarısı yazdırın
     */

        int input=10;
        faktoryelHesapla(input);


    }

   public static void faktoryelHesapla(int input) {

        int faktoriyel=1;

        if (input<0 || input>20){
            System.out.println("verilen sayı için faktoryel hesaplanmaz");
        }else if (input==0){
            System.out.println("0! =1 'dir ");
        }else{
            for (int i = 1; i <=input; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel değeri : " + faktoriyel);


        }

    }
}


