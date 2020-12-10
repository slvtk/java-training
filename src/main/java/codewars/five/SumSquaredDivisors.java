package codewars.five;

import java.util.*;

/*
returns the num
and sum of its divisor squares
if its the square of some nums
 */

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        List<String> divisors = new ArrayList<>();
        int sumOfDivs = 0;
        for (long i = m; i <= n; i++) {
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sumOfDivs += j * j;
                }
            }
            String str = String.valueOf(Math.sqrt(sumOfDivs));
            if (str.substring(str.indexOf('.') + 1).length() == 1) {
                divisors.add(Arrays.toString(new long[]{i, sumOfDivs}));
            }
            sumOfDivs = 0;
        }
        return divisors.toString();
    }
}


