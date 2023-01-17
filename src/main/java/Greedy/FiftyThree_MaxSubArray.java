package Greedy;

public class FiftyThree_MaxSubArray {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            result = Math.max(result, count);
            if (count <= 0) count = 0;
        }
        return result;
    }
}
