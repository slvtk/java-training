package codewars.six;

import java.util.Arrays;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(numbers).forEach(sb::append);
        return sb.toString().replaceAll("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }
}