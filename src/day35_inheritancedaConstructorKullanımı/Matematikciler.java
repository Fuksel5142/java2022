package day35_inheritancedaConstructorKullanımı;

public class Matematikciler extends LOgretmen {
    Matematikciler(){ // super var mı extends varsa ilk sartırda super vardır
        System.out.println("Matematik paametresiz cons");
    }

    Matematikciler(String isim){
        this(); // bı cşlass daki parametresiz var mı
        System.out.println("LOgretmen parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler();
    }
    /*
    this(); constructor call içinde bulunulan class daki constructırları,
    super() ise parent da bulunan constructorları çağırır

    this() ve ya super () parametre yapısına uygun bir constructor bulamazsa
    Jaca CTE verir
    constructor konusunda gorduğumuz this.
    o class daki instance variable ları refere ediyordu.

    inheritance da da super vardır.
    super

     */
}
