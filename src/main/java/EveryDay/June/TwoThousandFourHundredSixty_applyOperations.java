package EveryDay.June;

public class TwoThousandFourHundredSixty_applyOperations {
    public static void main(String[] args) {

    }

    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right++;
                left++;
            } else {
                right++;
            }
        }
        return nums;
    }
}
