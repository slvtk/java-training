package collections.lowerCase;

import java.util.*;
//turn every string in List to lowerCase
public class Main {
    public static String toLowerCase(String[] str) {
        List<String> a = new ArrayList<>(Arrays.asList(str));
        for (String s : a) {
            System.out.println(s.toLowerCase(Locale.ROOT));
        }
        return null;
    }
}
