package day05_variables;

public class C02_Pre_Post_İncrement {

    public static void main(String[] args) {

        int sayi=10;
        System.out.println("pre-increment  : " + ++sayi);


        System.out.println("post increment  : " + sayi++);

        System.out.println("post-increment den sonra : " + sayi);

        sayi++;
        ++sayi;

        System.out.println(sayi);

    }
}
