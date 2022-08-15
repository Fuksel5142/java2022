package Day34_inheritance;

public class ToyotaCoralla extends Toyota {
    public static void main(String[] args) {
        /*
        Child class dan parent classa erişimde
        acces modifier kurallarını bypass edemeyiz
        örneğin parent classs daki private class üyelerini
        child class dan kullanamayız aynı şekilde parent ve child farklı package larda ise
        parent class daki default acces modifier i
        olan class üyelerini child class dan kullanamyız
         */

        ToyotaCoralla arb1=new ToyotaCoralla();
        System.out.println(arb1.marka); // toyota
        System.out.println(arb1.model);


}}
