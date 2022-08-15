package day42_abstracClass_interfaces;

import Notlar.Main;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces {
    /*
    bİR CLASSİ  BİR İNTERFACE E CHİLD YAPMAK İÇİN
    implements keywordü kullanılır implements dedikten sonra virgül yazarak
    istediğimiz kadar interface ekleyebiliriz

    bir interface bir classı parent edinemez
     */

    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYİ); // 20
        System.out.println(I02_Interfaces.SAYİ); // 30);
    }
}
