package Array;

public class ThityOne_NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,2,0,4,3,1};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        int i = length - 2;
        //find the first increase;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            reverse(nums, 0, length - 1);
        } else {
            //from i+1 to length-1 find the first number k bigger than number i which search from last to first;
            int k = length - 1;
            for (; k > i; k--) {
                if (nums[k] > nums[i]) {
                    swap(nums, k, i);
                    reverse(nums, i + 1, length - 1);
                    break;
                }
            }
        }
    }

    public static void swap(int[] nums, int i, int k) {
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
