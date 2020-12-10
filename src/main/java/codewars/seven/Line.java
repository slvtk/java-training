package codewars.seven;

public class Line {
    public static String tickets(int[] peopleInLine) {
        int a25 = 0;
        int a50 = 0;
        int a100 = 0;

        for (int j : peopleInLine) {
            if (j == 25) {
                a25 += 1;
            } else if (j == 50) {
                if (a25 >= 1) {
                    a50 += 1;
                    a25 -= 1;
                } else {
                    return "NO";
                }
            } else if (j == 100) {
                if (a25 >= 3) {
                    a100 += 1;
                    a25 -= 3;
                } else if ((a50 >= 3) && (a25 >= 1)) {
                    a100 += 1;
                    a50 -= 3;
                    a25 -= 1;
                }
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
