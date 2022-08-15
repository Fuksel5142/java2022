package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman güzeldir");
        sb.delete(8,9);
        System.out.println(sb);//Java heraman güzeldir

        sb.deleteCharAt(7);
        System.out.println(sb);

        // bastan baslayarak her Loop da ilk harfi silip
        // kalanı yazdıralım

        int son=sb.length();
        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

        }
    }
}
