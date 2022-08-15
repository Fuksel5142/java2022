package day12_okulProje;

public class Kişi {
   private String adsoyad;
   private String kimlikno; // kapsüle ediyor
   private int yas;// herkesin otak özelliği

    public Kişi(String adsoyad, String kimlikno, int yas) {
        this.adsoyad = adsoyad;
        this.kimlikno = kimlikno;
        this.yas = yas;
    }
    public Kişi(){

    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public String getKimlikno() {
        return kimlikno;
    }

    public int getYas() {
        return yas;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public void setKimlikno(String kimlikno) {
        this.kimlikno = kimlikno;
    }

    public void setYas(int yas) { // yas kontrolu yapuınız
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kişi{" +
                "adsoyad='" + adsoyad + '\'' +
                ", kimlikno='" + kimlikno + '\'' +
                ", yas=" + yas +
                '}';
    }
}
