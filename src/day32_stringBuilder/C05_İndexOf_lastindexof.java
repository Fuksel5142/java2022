package day32_stringBuilder;

public class C05_İndexOf_lastindexof {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("attention")); //0

        System.out.println(sb); // pay attention please

        System.out.println(sb.indexOf("e"));//7

        System.out.println(sb.indexOf("e", 10));//16 // indexof baştan itibaren arar
        // fromindez x sona doğru


        System.out.println(sb.lastIndexOf("e"));//19

        System.out.println(sb.lastIndexOf("e", 10)); // 7


    }




}
