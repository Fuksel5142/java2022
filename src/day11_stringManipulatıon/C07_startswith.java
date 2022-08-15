package day11_stringManipulatıon;

public class C07_startswith {
    public static void main(String[] args) {

        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("Java"));

        System.out.println(input.endsWith("r"));

        System.out.println(input.startsWith("u",7));
    }

}
