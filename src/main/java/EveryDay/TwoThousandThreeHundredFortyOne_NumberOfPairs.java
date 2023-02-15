package EveryDay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoThousandThreeHundredFortyOne_NumberOfPairs {
    public static void main(String[] args) {

    }

    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int[] result = {0,n};
        for (int i = 0; i < n; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
                result[0]++;
                result[1]-=2;
            }else set.add(nums[i]);
        }
        return result;
    }
}
