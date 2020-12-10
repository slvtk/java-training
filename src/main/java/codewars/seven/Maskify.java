package codewars.seven;

import java.util.Arrays;

//mask like in credit cards - 1234567 -> ###4567
public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        char[] chars = new char[str.length() - 4];
        Arrays.fill(chars, '#');
        return String.valueOf(chars) + str.substring(str.length() - 4);
    }
}
