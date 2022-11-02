package Array.MInSubArrayLen;

public class TwoHundredNine_MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE, minLength = Integer.MAX_VALUE;
        int sum = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLength = i - j + 1;
                result = minLength < result ? minLength : result;
                sum -= nums[j];
                j++;
            }
        }
        if (result == Integer.MAX_VALUE) return 0;
        return result;
    }
}
