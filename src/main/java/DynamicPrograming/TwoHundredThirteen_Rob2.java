package DynamicPrograming;

import javax.sound.midi.Soundbank;

public class TwoHundredThirteen_Rob2 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(robAction(nums, 0, nums.length - 2), robAction(nums, 1, nums.length - 1));
    }

    public int robAction(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 1];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i - start] = Math.max(dp[i - 1 - start], dp[i - 2 - start] + nums[i]);
        }
        return dp[end - start];
    }
}
