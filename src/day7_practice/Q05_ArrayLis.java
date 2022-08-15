package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayLis {
    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     *///  trim ile sağdaki soldaki isimleri sileriz
    // ctrl+d ile satırları  çoğaltıyoruz
    // istersek add metodunu kullanmyıp parantez içine ass.list ile de ekleyebiliriz;

    public static void main(String[] args) {
        List<String> databaseİsimler = new ArrayList<String>();
        databaseİsimler.add("Enes");
        databaseİsimler.add("İsmail");
        databaseİsimler.add("Abdulbaki");
        databaseİsimler.add("Emre");
        databaseİsimler.add("Melisa");
        databaseİsimler.add("oguz");
        Scanner scan=new Scanner (System.in);
        System.out.print("kullanmak istediginiz usernamei giriniz :");
        String username = scan.nextLine().trim();

        boolean usernameVarmi=databaseİsimler.contains(username);
        if(usernameVarmi){
            int randomSayi = new Random().nextInt(100);
            username= username+ "" + randomSayi;
            databaseİsimler.add(username);
            System.out.println("databaseİsim = " +username);
        }else{
                System.out.println("bu kullanici adini kullanabilirsiniz");}
                databaseİsimler.add(username);





    }
}
