package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        arb1.setModel("Coralla");
        System.out.println( arb1.getYakit());


        // access modifier kullanarak marka variable'ina ulasimi
   // tamamen serbest yapabilir veya tamamen engelleyebilirim
   // private yaptigimiz modele ise hic ulasamayiz
   // yani access modifier ya hep ya hic diyor

   // modeli degistirelim ama goremeyelim
  // yakiti da gorelim ama degistiremeyelim


        // set ve get yetkilerini özel olarak tanımlamak
        // isterseniz özel yetki tanımlayacağınız variable ları pivate yapın
        // private bir dataya başka class lardan ulaşmak mümkün olmadığından
        // 2.adım - set yetkisi için setter, get yetkisi için
        // getter metodları oluşturalım

    }

}
