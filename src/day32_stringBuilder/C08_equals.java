package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1));  // true
        // StringBuilder da equals methodu ancak aybı onje olursa
        // true döner

        System.out.println(sb1.equals(str));// false
        // parantez içiçnde str olursa false verir

        System.out.println(sb1.compareTo(sb2));// 0

        StringBuilder sb3= new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));       }}

