package Yazılım_teknolonoji_Akademisi;

import java.util.HashMap;
import java.util.Map;

public class yorumhashmao {
    public static void main(String[] args) {
        String s = "ABCCD";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            if (map.get(s.charAt(i)) == 2) {
                System.out.println(s.charAt(i));
                break;

            }

        }

    }

}
