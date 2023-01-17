package Greedy;

public class ThreeHundredSeventySix_WiggleMaxLength {
    public static void main(String[] args) {
        int[] sums = {0,0,0};
        System.out.println(wiggleMaxLength(sums));
    }

    public static int wiggleMaxLength(int[] nums) {
        int result = 2;
        if (nums.length <= 1) return nums.length;
        int j = 0;
        while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
        if(j >= nums.length-1) return 1;
        boolean flag = nums[j] > nums[j + 1] ? false : true;
        for (int i = j+1; i < nums.length; i++) {
            if (!flag && nums[i] > nums[i - 1]) {
                result++;
                flag = true;
            } else if (flag && nums[i] < nums[i - 1]) {
                result++;
                flag = false;
            }
        }
        return result;
    }
}
