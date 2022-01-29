package codewars.six;

import java.util.*;

public class Order {
    public static String order(String words) {
        String[] wordsSpl = words.split(" ");
        Character[] chars = words.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Map<Integer, String> strings = new HashMap<>();
        int i = 0;
        for (Character ch : chars) {
            if (Character.isDigit(ch)) {
                strings.put(Integer.parseInt(String.valueOf(ch)), wordsSpl[i]);
                i++;
            }
        }
        ArrayList<String> fin = new ArrayList<>();
        strings.forEach((k, v) -> fin.add(v));
        return fin.toString().substring(1, fin.toString().length() - 1).replaceAll(",", "");
    }
}
