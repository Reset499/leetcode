package DynamicPrograming;

import java.util.Arrays;

public class SixHundredSeventyFour_FindLengthOfLCIS {
    public static void main(String[] args) {
    }
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0||nums==null) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) dp[i] = dp[i-1]+1;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) result = Math.max(result,dp[i]);
        return result;
    }
}
