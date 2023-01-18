package Greedy;

import java.util.Arrays;

public class OneThousandFive_LargestSumAfterNegations {
    public static void main(String[] args) {

    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        int i = 0;
        Arrays.sort(nums);
        while (k > 0) {
            nums[i] = -nums[i];
            k--;
            if (i+1 < nums.length && nums[i] > nums[i + 1]) i++;
        }
        return Arrays.stream(nums).sum();
    }
}
