package day28_staticBlock;

public class Statikblok2 {
    public static void main(String[] args) {

        int fiyat=1000;

        System.out.println("Methodda hesaplana fiyat:" + indirim(fiyat));
        System.out.println("Method call sonrası fiyat:" + fiyat);


    }

    private static int indirim(int fiyat) {
        fiyat *=2;
        return fiyat;



    }
}
