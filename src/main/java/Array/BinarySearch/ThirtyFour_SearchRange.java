package Array.BinarySearch;

public class ThirtyFour_SearchRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(result[0] + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        int[] result = {leftBorder, rightBorder};
        return result;
    }

    public static int getRightBorder(int[] nums, int target) {
        int length = nums.length;
        int rightBorder = -1;
        int left = 0, right = length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if ((mid == length - 1 && nums[mid] == target) || (nums[mid] == target && nums[mid + 1] != target))
                return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return rightBorder;
    }

    public static int getLeftBorder(int[] nums, int target) {
        int length = nums.length;
        int leftBorder = -1;
        int left = 0, right = length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if ((mid == 0 && nums[mid] == target) || (nums[mid] == target && nums[mid - 1] != target)) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return leftBorder;
    }
}
