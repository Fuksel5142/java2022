package day08_İfstatements;

import java.util.Scanner;

public class C01_İfselstatements {

    public static void main(String[] args) {
        // kullanıcıdan gun ismini yazmasını isteyin
        // girilen isim geçerli bir gün ise isminin 1.,2., ve 3. harflerini
        // ilk harf buyuk diğer ikisi küçük olarak yazdırın
        // gun ismi geçerli değilse "gecerli gun ismi giriniz" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("sali")){
            System.out.println("Sal");
        } else if(gun.equals("Carsamba")){
            System.out.println("Car");
        } else if (gun.equals("persembe")){
            System.out.println("Per");
        }else if (gun.equals("Cuma")){
            System.out.println("Cum");
        }else if (gun.equals("Cumartesi")){
            System.out.println("Cum");
        }else if (gun.equals("pazar")){
            System.out.println("Paz");
        } else {
            System.out.println("Lutfen gecerli gun  giriniz");
        }
    }
}
