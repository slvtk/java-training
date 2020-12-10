import java.util.Arrays;

public class Randomizer {
    private final int[] numbers;
    private final int[] probabilities;

    public Randomizer(int[] numbers, int[] probabilities) {
        this.numbers = numbers;
        this.probabilities = probabilities;
    }

    public int getInt() {
        int offset = 0;
        int[] all = new int[numbers.length * probabilities.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < probabilities[i]; j++) {
                all[offset] = numbers[i];
                offset++;
            }
        }
        return all[(int) (Math.random() * (all.length - 1))];
    }

}
