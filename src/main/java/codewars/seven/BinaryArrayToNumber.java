package codewars.seven;

import java.util.List;

//converting binary array to int
public class BinaryArrayToNumber {
    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int ans = 0, i = 0;
        for (Integer integer : binary) {
            ans += integer * Math.pow(2, binary.size() - 1 - i++);
        }
        return ans;
    }
}
