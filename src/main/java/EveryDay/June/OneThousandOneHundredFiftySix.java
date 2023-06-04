package EveryDay.June;

import java.util.HashMap;
import java.util.Map;

public class OneThousandOneHundredFiftySix {
    public static void main(String[] args) {
        System.out.println(maxRepOpt1("aaabaaa"));
    }

    public static int maxRepOpt1(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int max = 0;
        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) count[text.charAt(i) - 'a']++;
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
            if (map.size() == 1 || (map.size() == 2 && (map.containsValue(1)))) {
                max = Math.max(max, i - left + 1);
                continue;
            }
            while (!(map.size() == 1 || (map.size() == 2 && (map.containsValue(1)))) && left < i) {
                if (map.get(text.charAt(left)) == 1) map.remove(text.charAt(left));
                else map.put(text.charAt(left), map.get(text.charAt(left)) - 1);
                left++;
            }
        }
        return max;
    }
}
