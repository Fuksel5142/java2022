package day15_overloadingfoorlop;

public class C06_Stringterseçecirme {

    public static void main(String[] args) {
        // input olarak verilen Stringi terse çevirip yazdıran bir method oluşturun

        String input="java gun gectikce guzellesiyor";

        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);  // substring(4,5)

        }
        System.out.println(tersInput);
    }
}
