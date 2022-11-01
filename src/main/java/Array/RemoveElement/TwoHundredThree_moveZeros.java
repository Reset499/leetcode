package Array.RemoveElement;

public class TwoHundredThree_moveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int j = 0, i = 0;
        while (i < length) {
            if (nums[i] == 0) i++;
            else {
                nums[j] = nums[i];
                i++;
                j++;
            }
        }
        while(j<length){
            nums[j] = 0;
            j++;
        }
    }

}
