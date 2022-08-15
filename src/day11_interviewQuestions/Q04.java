package day11_interviewQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sifre="Fuksel51.";
        int girishakki=3;

        while (true) {
            System.out.println("Luften sifrenizi giriniz" );
            String girilensife= scan.nextLine();
            if (girilensife.equalsIgnoreCase(sifre)){
                System.out.println("sifre basarılı");
                        break;
            }else{
                girishakki--;
                System.out.println("Şifre yanlış "+girishakki+ "hakkınız kaldı");}
            if (girishakki == 0){
                System.out.println("sifreniz bloke oldu");
                break;
            }



        }


    }

}
