package codewars.six;

//because of Math.pow returns double, used multiply pow counting
public class ASum {
    public static long findNb(long m) {
        long n = 0;
        while (m > 0) {
            n++;
            m -= n * n * n;
        }
        return m == 0 ? n : -1;
    }
}
