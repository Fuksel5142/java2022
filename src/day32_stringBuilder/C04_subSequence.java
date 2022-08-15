package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3);
        // bu metod String döndürdüğü için Stringbu,lderin eski halini değiştirmz

        System.out.println( sb);

        sb.subSequence(0,3); // method string ya da sebsqunce döndürüyorsa değiştirmez

        System.out.println(sb); //


    }
}
