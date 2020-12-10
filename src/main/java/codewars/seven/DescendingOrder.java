package codewars.seven;

import java.util.*;
import java.util.stream.Stream;

//counting max int from number - 422351 -> 543221
public class DescendingOrder {
    public static int sortDesc(int num) {
        int finalInt = 0;
        int[] numbers = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            finalInt += numbers[i] * Math.pow(10, i);
        }
        return finalInt;
    }
}
