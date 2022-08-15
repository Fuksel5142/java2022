package Day09_practice.restorurant;

public class Mutfak {

    public String yemekler="adanakebab,urfaciger,kusbası,kusleme";// instance variable

    public String arasıcak="yaylacorba, mercimek, duguncorba,corba";

    public String tatlilar="baklava,sutlac,kazandibi,kunefe";

    public String icecekler="ayran,salgam,kola";

    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {
        this.yemekler = adanakebab;
        this.arasıcak = mercimek;
        this.tatlilar = kunefe;
        this.icecekler = salgam; //verir ama dinamik olmaz

    }

    public Mutfak() {

    }


    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                "\n arasıcak='" + arasıcak + '\'' +
                ", tatlilar='" + tatlilar + '\'' +
                ", icecekler='" + icecekler + '\'' +
                '}';
    }
}
