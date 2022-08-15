package day17_nestedForloop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen string deki harfleri
        // tekrarsız olarak yazdırıp
        //kelimede kullanılan farklı harf sayısını veren bir method yazınız
        String input="Java her zaman guzel";
        tekrarsızharf(input);
    }

    private static void tekrarsızharf(String input) {
        String benzersizinput="";
        String işlenecekİnput=input.replaceAll("\\W", "");
        benzersizinput+=işlenecekİnput.substring(0,1);


        for (int i = 0; i <işlenecekİnput.length() ; i++) {
            if (!benzersizinput.contains(işlenecekİnput.substring(i,i+1))){
                System.out.print(" ," +işlenecekİnput.substring(i,i+1));
                benzersizinput+=işlenecekİnput.substring(i,i+1);
            }

        }
        System.out.println();
        System.out.println("input :"+input);
        System.out.println("benzersizinput :"+benzersizinput);
    }

}

