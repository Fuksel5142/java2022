package day07_ifstatements;

public class C03_ifStatements {

    public static void main(String[] args) {
        /*
        Bir if statement da {kullanılmazsa java ilk satırı şart ile
        bağlar sonraki satırlar bağımsız olur

         */
        int sayi=23;
        if (sayi>0)
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktır");


        if (sayi%2==0)
            System.out.println("sayi cift");
        System.out.println("çift kalacaktır");


        if (sayi%5==0)
            System.out.println("sayi 5 in tam katı");


    }
}
