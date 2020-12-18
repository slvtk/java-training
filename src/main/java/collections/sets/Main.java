package collections.sets;

import java.util.*;
//realization of math sets operations
public class Main {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> second = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12));
        System.out.println(sum(first, second));
        System.out.println(subtraction(first, second));
        System.out.println(multiply(first, second));
    }

    private static Set<Integer> multiply(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> sum(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static Set<Integer> subtraction(Set<Integer> first, Set<Integer> second) {
        first.removeAll(second);
        return first;
    }
}
