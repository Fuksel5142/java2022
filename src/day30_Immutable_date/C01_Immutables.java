package day30_Immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutables {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Kenan");
        list.add("Enes");
        list.add("İsmail");

        System.out.println(list); //[Kenan, Enes, İsmail]

        list.set(1, "Yasemin"); // değiştiryor
        System.out.println(list);

        list.remove("İsmail");
        System.out.println(list); // Kenan yasemin


    }
}
