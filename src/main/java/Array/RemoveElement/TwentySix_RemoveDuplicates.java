package Array.RemoveElement;

public class TwentySix_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i = 0, j = 1, count = 1;
        while (j < length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}
