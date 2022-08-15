package day37_Ooverriding;

public class DAraba {
    private void yakıt(){
        System.out.println("Tüm arabalar yakıt kullanır");
        /*
        parent class dan override edilmesini istemediğiniz
        metodları private statik ve ya final yapabilirsiniz
         */

    }
    void marka(){
        System.out.println("Tüm arabalar markası vardır");
    }
    void motor(){
        System.out.println("Tüm arabalar motoru vardır");
    }
}
