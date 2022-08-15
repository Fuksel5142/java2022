package day37_Ooverriding;

public class FCupra extends EToyota {
    void yakıt() {
        System.out.println("Supra benzinli kullanır");
        /*
        private metodlar override edilemez
        Parent
         */

    }

    // notasyon
    void motor() {
        System.out.println("Sıralı 6 silindirli 232 motor kullanır");
    }
    /*
    @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir
     */
}

