package day18_while_doWhileLoop;
public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 1 ) 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.
         */
        int bas=7;
        int bitis=190;
        int tamp=bas;
        // while loop ile
        while(tamp<bitis){
            if (tamp%7==0){
                System.out.print(tamp + " ");
            }
            tamp++;
        }
        // do while loop ile yapalim
        System.out.println("");
        bas=7;
        do{
            if (bas%7==0){
                System.out.print(bas + " ");
            }
            bas++;
        }while(bas<190);
    }
    }
