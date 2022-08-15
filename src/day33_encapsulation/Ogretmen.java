package day33_encapsulation;

public class Ogretmen {
    private String isim;
    private String soyisim;
    private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    /*
    Bazen de yetkileri sınırlamak değilde
    yapılan işi daha iyi tanımlamak için
    encapsulation kullanılır.
    kalıphane olduğu ve run olmayacağı için main metoda gerek yok
    mtotlar clasın dışında olur
    main metot run edeceğimiz yerde olur

    bu yaklaşımı kullanan class larda tüm variable lar
    private yapılıp hepsi için getter ve setter oluşturulur
    hepsini private yapalım

     */

}
