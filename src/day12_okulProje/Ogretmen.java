package day12_okulProje;

public class Ogretmen extends Kişi{
    private String bolum;
    private String sicilNo;

    public Ogretmen(){
    }

    public Ogretmen(String adsoyad, String kimlikno, int yas, String bolum, String sicilNo) {
        super(adsoyad, kimlikno, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString();// parenttaki to stringi
    }
}
