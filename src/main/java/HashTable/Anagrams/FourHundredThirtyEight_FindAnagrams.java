package HashTable.Anagrams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourHundredThirtyEight_FindAnagrams {
    public static void main(String[] args) {
        String s = "abab", p = "ab";
        findAnagrams(s, p);
    }

    public static List<Integer> findAnagrams(String s, String p) {
//        int lengthP = p.length();
//        int lengthS = s.length();
//        char[] array = p.toCharArray();
//        Arrays.sort(array);
//        String sortedP = new String(array);
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i <= lengthS - lengthP; i++) {
//            String temp = s.substring(i, i + lengthP);
//            char[] array1 = temp.toCharArray();
//            Arrays.sort(array1);
//            String sortedTemp = new String(array1);
//            if (sortedTemp.equals(sortedP)) result.add(i);
//        }
//        return result;
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(sCount, pCount))
            result.add(0);
        for (int i = 0; i < sLen - pLen; i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + pLen) - 'a']++;
            if (Arrays.equals(sCount, pCount))
                result.add(i + 1);
        }
        return result;
    }
}

