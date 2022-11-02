package Array.MInSubArrayLen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SeventySix_MinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        Map<Character, Integer> charTable1 = new HashMap<Character, Integer>();
        Map<Character, Integer> charTable2 = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++)
            charTable2.put(t.charAt(i), charTable2.getOrDefault(t.charAt(i), 0) + 1);
        int j = 0, count = Integer.MAX_VALUE, resultLeft = -1, resultRight = -1;
        for (int i = 0; i < s.length(); i++) {
            if (charTable2.containsKey(s.charAt(i)))
                charTable1.put(s.charAt(i), charTable1.getOrDefault(s.charAt(i), 0) + 1);
            while (check(charTable1, charTable2) && j <= i) {
                if (i - j + 1 < count) {
                    count = i - j + 1;
                    resultLeft = j;
                    resultRight = i + 1;
                }
                if (charTable2.containsKey(s.charAt(j)))
                    charTable1.put(s.charAt(j), charTable1.getOrDefault(s.charAt(j), 0) - 1);
                j++;
            }
        }
        return resultLeft == -1 ? "" : s.substring(resultLeft, resultRight);
    }

    public static boolean check(Map<Character, Integer> charTable1, Map<Character, Integer> charTable2) {
        for (Map.Entry<Character, Integer> entry : charTable2.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (charTable1.getOrDefault(key, 0) < value) return false;
        }
        return true;
    }
}
