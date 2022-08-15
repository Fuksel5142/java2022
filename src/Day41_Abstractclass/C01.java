package Day41_Abstractclass;

public class C01 {
    public static void main(String[] args) {
        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }}

    private static void calis() {

        throw new RuntimeException("Çoook çalış");
        // throe ile kontrollu expection oluştururkne
        // parametre olarak istedğimiz hata mesajını girebiliriz

    }
}
