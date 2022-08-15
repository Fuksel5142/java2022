package day28_staticBlock;

public class StatiBlblok {
    static int sayi;
    static {  // statik blok
        /*
        statik blok class üyelerinin tamamından önce çalışır
        (main method'dan blile önce)
        statik blok class oluşturuldupunda calışır
        genellikle de clas la ilgili ön ayarlamalar
        veya static vsrisble lara değer atamak için kullanılır
        statik blokların class içerisinde nerede olduğu önemli değildir
        önce static blok çalısır
        birden fazla statiic blok varsa yukarıdan aşağıya doğru çalışır
         */
        System.out.println("static blok 10calışti");
    }

    public static void main(String[] args) {
        System.out.println("Main metot çaloştı");

        System.out.println(sayi);

    }
    static {  // static blok a static dışında bir şey yazmıyoroz
        System.out.println("Main metot altındaki static blok calıştı");

    }
}
