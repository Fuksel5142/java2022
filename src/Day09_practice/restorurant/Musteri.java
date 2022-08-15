package Day09_practice.restorurant;

public class Musteri {
    public static void main(String[] args) {
        Mutfak menu = new Mutfak();

        System.out.println("menu.tostring()="+ menu.toString());

        Mutfak siparisim= new   Mutfak("adanakebab","mercimek","kunefe","Salgam");

        System.out.println("siparisim="+siparisim); // this yapacaz
    }// ilk class da to string onu düzenli yazdırmak için
}
