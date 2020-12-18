package codewars.seven;

import java.util.*;

import static java.util.Arrays.asList;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(asList()));
    }

    public static List<String> number(List<String> lines) {
        List<String> countedLines = new ArrayList<>();
        int counter = 1;
        for (String line : lines) {
            countedLines.add(counter++ + ": " + line);
        }
        return countedLines;
    }
}