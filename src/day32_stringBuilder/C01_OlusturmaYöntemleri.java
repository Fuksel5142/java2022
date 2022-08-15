package day32_stringBuilder;

public class C01_OlusturmaYöntemleri {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        StringBuilder sb3 = new StringBuilder("Java Candir...");

        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity()); // 16

        System.out.println(sb2.length()); //
        System.out.println(sb2.capacity()); //

        System.out.println(sb3.length()); //
        System.out.println(sb3.capacity()); //

        sb1.append("Java");


        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append(" Candir");

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append(", bilen bilir.");

        System.out.println(sb1.length());//25
        System.out.println(sb1.capacity()); // 34 (16*2+2)

    }
}
