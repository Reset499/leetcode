package Greedy;

public class FiftyFive_CanJump {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 0, 1, 1};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        int coverRange = 0;
        for (int i = 0; i <= coverRange; i++){
            coverRange = Math.max(coverRange,i+nums[i]);
            if(coverRange>= nums.length-1) return true;
        }
            return false;
    }
}
