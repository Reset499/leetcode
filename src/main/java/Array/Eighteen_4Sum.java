package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eighteen_4Sum {
    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        System.out.println(fourSum(nums, target).toString());
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int first = 0; first < length - 3; first++) {
            if (first != 0 && nums[first] == nums[first - 1]) continue;
            for (int second = first + 1; second < length - 2; second++) {
                if (second != first + 1 && nums[second] == nums[second - 1]) continue;
                int third = second + 1;
                int fourth = length - 1;
                while (third < fourth) {
                    if (third != second + 1 && nums[third] == nums[third - 1]) {
                        third++;
                        continue;
                    }
                    if (fourth != length - 1 && nums[fourth] == nums[fourth + 1]) {
                        fourth--;
                        continue;
                    }
                    if ((long)nums[first] + nums[second] + nums[third] + nums[fourth] < target) {
                        third++;
                    } else if ((long)nums[first] + nums[second] + nums[third] + nums[fourth] > target) {
                        fourth--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        list.add(nums[fourth]);
                        result.add(list);
                        third++;
                    }
                }
            }
        }
        return result;
    }
}
