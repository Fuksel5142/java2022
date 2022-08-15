package day10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {


        String str= "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf('J'));
        System.out.println(str.indexOf("t")); // yanlış olduğu için -1

        String str5= " wtegdgdg";

        if (str5.indexOf("p") ==-1){
            System.out.println("str5 de istenen karakter kullanılmiıştır");
        } else {
            System.out.println("str5 de istenen karakter kullanılmaıştır");
        }
    }
}
