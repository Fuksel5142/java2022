package Day41_Abstractclass;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        abstract bir parent in concrete child class i
        inherit ederse parent abstract class daki tüm abstract methodları
        override etmek zorundadır
        abstract bir class, abstract başka bir class ı parent edinirse
        parent class daki tüm abstract methodları ovrride etmek zorunda değildir
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
