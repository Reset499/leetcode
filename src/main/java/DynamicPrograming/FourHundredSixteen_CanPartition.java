package DynamicPrograming;

public class FourHundredSixteen_CanPartition {
    public static void main(String[] args) {

    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        if (sum % 2 != 0) return false;
        int bagSize = sum/2;
        int[] dp = new int[bagSize+1];
        for(int i = 0;i<nums.length;i++){
            for(int j = bagSize;j>=nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[bagSize]==bagSize;
    }
}
