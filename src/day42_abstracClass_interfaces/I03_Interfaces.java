package day42_abstracClass_interfaces;

public interface I03_Interfaces {

    int SAYİ=20;
    /*
    İnterface lerde tüm variable lar public staticv e final dır
    dolayısıyla sonradan değer atama şansımız yoktur
    bunun için varaible oluştırduğumuzda mutlaka değer atamalıyız
    Bir interface bir class ı parent edinemez
     */

    /*
    biz yazmasak da interface içerisindeki her method
    public abstract ve static  özelliklere sahiptir
    abstract bir method'un body'si olmasi mumkun degildir
       Java sonradan developer'larin istegi uzerine
       kismi bir update yapmistir.
       Bir interface'e sonradan bir abstract method eklerseniz
       o interface'i daha once implement etmis tum class'lara gidip
       hepsinde yeni eklenen method'u override etmeniz gerekir
       Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.
       Bunun icin Java Java8'den itibaren
       interface'lere sonradan body'si olan method eklenmesine izin vermistir.
       Bu method'larin body'si olsa da Interface'in yapisi geregi
       bu method'lara concrete denmez
       body'si olan bu method'lar istisna olarak kabul edilebilir.
     */


    }


