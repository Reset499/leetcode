package EveryDay.May;

import java.util.HashMap;
import java.util.Map;

public class TwoThousandFiftyOne_OddString {
    public static void main(String[] args) {
        System.out.println(oddString(new String[]{"abm","bcn","alm"}));
    }

    public static String oddString(String[] words) {
        int n = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        String[] strings = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n - 1; j++)
                stringBuilder.append(words[i].charAt(j + 1) - words[i].charAt(j)+"-");
            strings[i] = stringBuilder.toString();
        }
        for (int i = 1; i < strings.length - 1; i++) {
            if (!strings[i - 1].equals(strings[i]) && strings[i].equals(strings[i + 1])) return words[i - 1];
            if (!strings[i - 1].equals(strings[i]) && !strings[i].equals(strings[i + 1])) return words[i];
            if (strings[i - 1].equals(strings[i]) && !strings[i].equals(strings[i + 1])) return words[i + 1];
        }
        return null;
    }
}
