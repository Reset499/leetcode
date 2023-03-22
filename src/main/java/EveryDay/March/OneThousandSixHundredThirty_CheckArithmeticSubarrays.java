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
        //gapNumber表示他们数组中有多少间隙
        int gapNumber = right - left, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        //找到最大最小的数在这个范围中
        for (int i = left; i <= right; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        //求出他们本应该的间隙距离 若除不净则直接return false 说明不成立
        if ((max - min) % gapNumber != 0) return false;
        int distance = (max - min) / gapNumber;
        //若distance等于0,则说明都一样 直接return true
        if (distance == 0) {
            return true;
        } else {//检查每一个是否符合这个等差数列 并标记防止有重复的数字出现
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
