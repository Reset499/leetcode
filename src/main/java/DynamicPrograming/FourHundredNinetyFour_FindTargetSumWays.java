package DynamicPrograming;

public class FourHundredNinetyFour_FindTargetSumWays {
    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        if (Math.abs(target) > sum || (target + sum) % 2 != 0) return 0;
        int bagSize = Math.abs((target - sum) / 2);
        int[] dp = new int[bagSize + 1];
        dp[0] =1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--)
                dp[j] += dp[j - nums[i]];
        }
        return dp[bagSize];
    }
}


