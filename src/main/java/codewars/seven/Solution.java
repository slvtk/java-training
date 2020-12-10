package codewars.seven;

//text representation of names array
public class Solution {
    public static String whoLikesIt(String... names) {
        String out = null;
        switch (names.length) {
            case (0):
                out = "no one likes this";
                break;
            case (1):
                out = names[0] + " likes this";
                break;
            case (2):
                out = names[0] + " and " + names[1] + " like this";
                break;
            case (3):
                out = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                out = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }
        return out;
    }
}