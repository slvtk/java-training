package codewars.seven;

//People count
public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int k = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            k++;
        }
        return k;
    }
}
