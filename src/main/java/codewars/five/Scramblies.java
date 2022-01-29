package codewars.five;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] charsIn = str2.toCharArray();
        int similar = 0;
        for (int i = 0; i < charsIn.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (charsIn[i] == chars[j]) {
                    charsIn[i] = '#';
                    chars[j] = '*';
                    similar++;
                }
            }
            if (similar == charsIn.length) {
                return true;
            }
        }
        return false;
    }
}
