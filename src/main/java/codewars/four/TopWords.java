package codewars.four;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class TopWords {
    public static List<String> top3(String s) {
        Map<String, Integer> sorted = new TreeMap<>();
        String[] strings = s.toLowerCase(Locale.ROOT).split(" ");
        for (String word :
                strings) {
            String replacement = word.replaceAll("[^а-яА-Яa-zA-Z0-9']", "");
            if (!(replacement.equals("") || replacement.matches("'+"))) {
                sorted.put(replacement, sorted.getOrDefault(replacement, 0) + 1);
            }
        }

        Map<String, Integer> sorted1 = sorted
                .entrySet()
                .stream()
                .sorted(comparingByValue(Comparator.reverseOrder()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
        System.out.println(sorted1);
        return sorted1.size() < 3 ? new ArrayList<>(sorted1.keySet()) : new ArrayList<>(sorted1.keySet()).subList(0, 3);
    }
}
