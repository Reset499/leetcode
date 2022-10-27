package Array;

import java.util.Arrays;

public class Sixteen_3SumCloset {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int target = 0;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int length = nums.length;
        int MinAbs = Integer.MAX_VALUE;
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
                int NowAbs = Math.abs(target - nums[first] - nums[second] - nums[third]);
                int sum = nums[first] + nums[second] + nums[third];
                result = MinAbs > NowAbs ? sum : result;
                MinAbs = MinAbs > NowAbs ? NowAbs : MinAbs;
                if (nums[first] + nums[second] + nums[third] < target) {
                    second++;
                } else if (nums[first] + nums[second] + nums[third] > target) {
                    third--;
                } else return nums[first] + nums[second] + nums[third];
            }
        }
        return result;
    }
}
