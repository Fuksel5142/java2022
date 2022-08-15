package Notlar;

public class Methodoverl {
    public static void Toplama(String a, String b) {
        System.out.println(a    + " " + b);
    }
    public static void Toplama(int a,int b){
        System.out.println("Toplamları = "+(a+b));

    }

    public static void main(String[] args) {
        Toplama(3,5);
        Toplama(3,5,6);
        Toplama("İbrahim fatih", "Yüksel");



    }
    public static void Toplama(int a, int b,int c) {
        System.out.println("Toplamları2 = "+(a+b+c));
    }
}
