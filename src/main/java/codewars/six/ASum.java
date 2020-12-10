package codewars.six;

public class ASum {
    public static void main(String[] args) {
        System.out.println(findNb(1749405741869456784L));
    }

    public static long findNb(long m) {
        long n = 0;
        while (m > 0) {
            n++;
            m -= Math.pow(n, 3);
        }
        return m == 0 ? n : -1;
    }
}
