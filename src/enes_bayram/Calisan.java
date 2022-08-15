package enes_bayram;

public class Calisan {

    public int no;

    public String isim;

    public String soyisim;

    public int tecrübe;

    public double maas;

    public Calisan() {
    }

    public Calisan(int no, String isim, String soyisim, int tecrübe, double maas) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.tecrübe = tecrübe;
        this.maas = maas;
    }

    public void calisanBilgileriGoster(){
        System.out.println("*******Çalısan Bilgileri******");
        System.out.println("No : " + no);
        System.out.println("İsim : " + isim);
        System.out.println("Soyisim : " + soyisim);;
        System.out.println("Tecrübe : " + tecrübe);



    }

    public void zamyap(int zamdegeri){
        System.out.println("Maasınıza "+zamdegeri +" TL zam yapuldı.");
        System.out.println("ŞUanki güncel maaşınız : "+ (maas+ zamdegeri));
    }

    public void formatAt(String isletimSistemi , String kim){
        System.out.println(kim +"şuanda "+ isletimSistemi+ "isletim sistemine format atıyor.");
    }


}
