package DynamicPrograming;

import java.util.Arrays;

public class ThreeHundred_LengthOfLIS {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length;i++){
            for(int j = 0; j<i;j++){
                if(nums[j]<nums[i]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
