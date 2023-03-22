package EveryDay.March;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneThousandSixHundredThirty_CheckArithmeticSubarrays {
    public static void main(String[] args) {

    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            result.add(check(nums, l[i], r[i]));
        }
        return result;
    }

    public Boolean check(int[] nums, int left, int right) {
        int gapNumber = right - left, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if ((max - min) % gapNumber != 0) return false;
        int distance = (max - min) / gapNumber;
        if (distance == 0) {
            for (int i = left; i <= right; i++) {
                if (nums[i] != min) return false;
            }
            return true;
        } else {
            Set<Integer> set = new HashSet<>();
            for (int i = left; i <= right; i++) {
                if ((nums[i] - min) % distance == 0 && !set.contains(nums[i])) {
                    set.add(nums[i]);
                }else return false;
            }
            return true;
        }
    }
}
