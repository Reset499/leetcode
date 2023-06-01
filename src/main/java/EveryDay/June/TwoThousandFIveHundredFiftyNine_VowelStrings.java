package EveryDay.June;

import java.util.HashSet;
import java.util.Set;

public class TwoThousandFIveHundredFiftyNine_VowelStrings {
    public static void main(String[] args) {

    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int[] result = new int[queries.length];
        int[] prefix = new int[words.length];
        if (set.contains(words[0].charAt(0)) && set.contains(words[0].charAt(words[0].length() - 1))) prefix[0] = 1;
        for (int i = 1; i < words.length; i++) {
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1)))
                prefix[i] = prefix[i - 1] + 1;
            else prefix[i] = prefix[i-1];
        }
        for(int i = 0;i< queries.length;i++){
            if(queries[i][0] == 0) result[i] = prefix[queries[i][1]];
            else result[i] = prefix[queries[i][1]]-prefix[queries[i][0]-1];
        }
        return result;
    }
}
