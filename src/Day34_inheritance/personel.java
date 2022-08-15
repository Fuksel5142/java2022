package Day34_inheritance;

public class personel {
    /*
    eğer parent class olacak şekilde tasarladığınız bir class veya ileride bu class ı parent
    yapmak isteynler olabilir o zaman variable ve method ların acces modifiierlari
    acces modifiierlari protecded
     */

    int persNo;
    protected String isim="İsim brlrtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tüm personelin maası vardır");
    }
    protected void mesai(){
        System.out.println("Tüm personel Statüsüne göre mesai yapar");
    }

    protected void  fazlamesaiUcreti(){
        System.out.println("Personeş fazla mesai  ücretini statüsüne göre alır");
    }

    protected void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }

}
