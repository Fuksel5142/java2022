package day11_stringManipulatıon;

public class C02_lastindexof {
    public static void main(String[] args) {

        String cumle="java cok kolay, java cok guzel";
        String kelime="java";

        /* verilen kelime için aşağıdaki şartlardan uygun olanı yazan bir program yazınız
        verilen kelime cümlede kullanılmamış
        verilen kelime cümlede sadece 1 kere kullanılmış
        verilen kelime cümlede birden fazla kullanılmış
         */

        int  kelimeIlkIndex= cumle.indexOf(kelime);
        int kelimeSonindex= cumle.lastIndexOf(kelime);
        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanılmamıs");
        }else if (kelimeIlkIndex==kelimeSonindex){
            System.out.println("verilen kelime cümlede sadece 1 kere kullanılmıs");
        }else{
            System.out.println("verilen kelime cümlede birden fazla kullanılmıs");
        }
    }
}
