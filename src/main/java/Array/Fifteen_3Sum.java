package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifteen_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        for (int first = 0; first < length - 2; first++) {
            if (first != 0 && nums[first] == nums[first - 1]) continue;
            int second = first + 1;
            int third = length - 1;
            while (second < third) {
                if (second != first + 1 && nums[second] == nums[second - 1]) {
                    second++;
                    continue;
                }
                if (third != length - 1 && nums[third] == nums[third + 1]) {
                    third--;
                    continue;
                }
                int sum = nums[first] + nums[second] + nums[third];
                if (sum < 0) second++;
                else if (sum > 0) third--;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    result.add(list);
                    second++;
                }
            }
        }
        return result;
    }
}
