package day27_staticKeyword;

public class Denemem {
      int count=0; // statik olmadığı için değer aynı
    public void increment(){
        count++;

    }

    public static void main(String[] args) {
        Denemem obj1=new Denemem();
        Denemem obj2=new Denemem();

        obj1.increment();
        System.out.println("obj1 : count is=" + obj1.count);

        obj2.increment();


        System.out.println("obj2 : count is=" + obj2.count);

    }
}
