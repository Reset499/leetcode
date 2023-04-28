package EveryDay.April;

import java.lang.reflect.Array;
import java.util.*;

public class TwoThousandTwentyThree_EqualFrequency {
    public static void main(String[] args) {

    }

    public boolean equalFrequency(String word) {
        int[] hash = new int[26];
        for (int i = 0; i < word.length(); i++) hash[word.charAt(i) - 'a']++;
        //这里的map的key指的是word中字母的数量,value是指有这个数量的字母有几个;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (hash[i] != 0) {
                if (map.containsKey(hash[i])) map.put(hash[i], map.get(hash[i]) + 1);
                else {
                    map.put(hash[i], 1);
                    list.add(hash[i]);
                }
            }
        }
        //若字母数量都一样,那么要么字母数量都为1,要么该数量的字母只有一个,否则false;
        if (list.size() == 1) return list.get(0) == 1 || map.get(list.get(0)) == 1;
        if (list.size() == 2) {
            int max = Math.max(list.get(0),list.get(1));
            int min = Math.min(list.get(0),list.get(1));
            if(min==1&&map.get(min)==1) return true;
            if(max == min+1&&map.get(max)==1) return true;
        }
        return false;
    }
}
