package EveryDay;

import java.util.HashMap;
import java.util.Map;

public class Three_LengthOfLongestSubstring {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0,result = 0;
        for(int right = 0;right<s.length();right++){
            map.putIfAbsent(s.charAt(right),0);
            while(map.get(s.charAt(right))>0){
                map.put(s.charAt(left++),0);
            }
                map.put(s.charAt(right),1);
                result = Math.max(result,right-left+1);
        }
        return result;
    }
}
