package day26_constructor;

public class Ogretmen {
    String isim="İsim belirtilmedi";
    String soyisim="Soyisim Belirtilmedi";
    String dogumtarihi  ="Tarih Belirtilmedi" ;
    String brans="Brans Belirtilmedi" ;
    String yanbrans="Yan brans Belirtilmedi" ;

    public Ogretmen(){

    }

    public Ogretmen(String isim, String soyisim, String dogumtarihi, String brans, String yanbrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
        this.brans = brans;
        this.yanbrans = yanbrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumtarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim:" + isim +
                "\nsoyisim='" + soyisim +
                "\ndogumtarihi='" + dogumtarihi +
                "\nbrans='" + brans +
                "\nyanbrans='" + yanbrans;
        // her seferinde uğraşmasın diye

    }
}
