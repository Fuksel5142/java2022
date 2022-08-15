package day10_stringManipulation;

public class C04_equalsIgnoreCase {

    public static void main(String[] args) {

        String  str1= "Ali Can";
        String  str2= "ALi Can";
        String  str3= "Ali Can" ;
        String str4= "Ali Can";

        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str3));

        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str4));

    }
}
