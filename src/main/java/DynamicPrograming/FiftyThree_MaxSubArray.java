package DynamicPrograming;

public class FiftyThree_MaxSubArray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
//        int result = Integer.MIN_VALUE;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            count += nums[i];
//            result = Math.max(result, count);
//            if (count <= 0) count = 0;
//        }
//        return result;
        if(nums==null||nums.length==0) return 0;
        int result = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
