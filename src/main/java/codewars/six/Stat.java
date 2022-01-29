package codewars.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stat {
    public static String stats(String strg) {
        if (!strg.isEmpty()) {
            String[] strings = strg.split(", ");
            List<Integer> valuesInSeconds = new ArrayList<>();
            int average = 0;
            int median;
            for (String str :
                    strings) {
                int intVal = Integer.parseInt(str.replaceAll("\\|", ""));
                valuesInSeconds.add(intVal / 10000 * 3600 + intVal % 10000 / 100 * 60 + intVal % 100);
            }
            Collections.sort(valuesInSeconds);
            for (Integer value :
                    valuesInSeconds) {
                average += value;
            }
            if (valuesInSeconds.size() % 2 == 0) {
                median = (valuesInSeconds.get(valuesInSeconds.size() / 2 - 1) + valuesInSeconds.get(valuesInSeconds.size() / 2)) / 2;
            } else {
                median = valuesInSeconds.get(valuesInSeconds.size() / 2);
            }
            return String.format("Range: %s Average: %s Median: %s",
                    toFormattedData(valuesInSeconds.get(valuesInSeconds.size() - 1) - valuesInSeconds.get(0)),
                    toFormattedData(average / valuesInSeconds.size()),
                    toFormattedData(median));
        }
        return "";
    }

    public static String toFormattedData(int valueInSeconds) {
        StringBuilder sb = new StringBuilder();
        int hours = valueInSeconds / 3600;
        int minutes = (valueInSeconds - hours * 3600) / 60;
        int seconds = (valueInSeconds - (minutes * 60 + hours * 3600));
        if (hours < 10) {
            sb.append("0").append(hours);
        } else {
            sb.append(hours);
        }
        sb.append("|");
        if (minutes < 10) {
            sb.append("0").append(minutes);
        } else {
            sb.append(minutes);
        }
        sb.append("|");
        if (seconds < 10) {
            sb.append("0").append(seconds);
        } else {
            sb.append(seconds);
        }
        return sb.toString();
    }
}
