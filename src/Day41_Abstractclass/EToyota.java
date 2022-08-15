package Day41_Abstractclass;

public abstract class  EToyota extends DAraba {


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar çevreci motor kullanır");
    }
    /*
    Parent class daki standart belirleyici method lar
    (abstract method) ların tamamı child class tarafından overiide edilmelidir
    concrete method ların override edilme mecburiyeti yoktur
    istersek override edebiliriz,istemesek etmeyiz

    aslinda toyota class ında obje üretebileceğimiz bir class değil
    bu durumda eğer proje tasarımı yapıyorsanız
    toyota class ınıda abstract yapmaız güzel olur

    fatih bu da kural koyucu olduğu için hepsini yapmadı


     */
}
