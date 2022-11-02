package Array.RemoveElement;

public class NineHundredSeventyseven_sortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int k = 1;
        int[] result = new int[length];
        int i = 0, j = length - 1;
        while (i <= j) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                result[length - k] = nums[j] * nums[j];
                j--;
            } else {
                result[length - k] = nums[i] * nums[i];
                i++;
            }
            k++;
        }
        return result;
    }
}
