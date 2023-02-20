package EveryDay;

import java.util.HashMap;
import java.util.Map;

public class TwoThousandThreeHundredFortySeven_BestHand {
    public static void main(String[] args) {

    }

    public String bestHand(int[] ranks, char[] suits) {
        Map<Integer, Integer> number = new HashMap<>();
        Map<Character, Integer> color = new HashMap<>();
        int max = 0;
        for (int i = 0; i < ranks.length; i++) {
            number.put(ranks[i], number.getOrDefault(ranks[i], 0) + 1);
            max = Math.max(number.get(ranks[i]),max);
            color.put(suits[i], number.getOrDefault(suits[i], 0) + 1);
        }
        if (color.size() == 1) return "Flush";
        if(max>=3) return"Three of a Kind";
        if (max>=2) return"Pair";
        if (number.size()==5)return"High Card";
        return null;
    }
}
