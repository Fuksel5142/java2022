package day12_okulProje;

public class Ogrenci extends Kişi { // cons control et

    private String OgrenciNo;
    private String sinif;

    public Ogrenci(String adsoyad, String kimlikno, int yas, String ogrenciNo, String sinif) {
        super(adsoyad, kimlikno, yas);
        OgrenciNo = ogrenciNo;
        this.sinif = sinif;

    }
    public Ogrenci(){
    }

    public String getOgrenciNo() {
        return OgrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        OgrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "OgrenciNo='" + OgrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString() ;// aynı şekilde parentdan
    }
}
