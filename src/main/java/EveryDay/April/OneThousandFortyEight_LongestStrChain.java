package EveryDay.April;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OneThousandFortyEight_LongestStrChain {
    public void main(String[] args) {
    }

    public int longestStrChain(String[] words) {
        int result = 1;
        Arrays.sort(words,((o1, o2) -> o1.length()-o2.length()));
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            map.put(word,1);
            for(int i = 0;i<word.length();i++){
                String pre = word.substring(0,i)+word.substring(i+1);
                if(map.containsKey(pre)){
                    map.put(word,Math.max(map.get(word),map.get(pre)+1));
                }
            }
            result = map.get(word)>result?map.get(word):result;
        }
        return result;
    }
}
