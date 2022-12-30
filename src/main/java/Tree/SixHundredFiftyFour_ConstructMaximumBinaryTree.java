package Tree;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class SixHundredFiftyFour_ConstructMaximumBinaryTree {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 0, 5};
        constructMaximumBinaryTree(arr);
    }

    static Map<Integer, Integer> map;

    static public TreeNode constructMaximumBinaryTree(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        TreeNode root = findBiggest(nums, 0, nums.length);
        return root;
    }

    static public TreeNode findBiggest(int[] nums, int start, int end) {
        if (start >= end) return null;
        if (end - start == 1) return new TreeNode(nums[start]);
        int maxValue = 0;
        for (int i = start; i < end; i++) {
            maxValue = nums[i] > maxValue ? nums[i] : maxValue;
        }
        int index = map.get(maxValue);
        TreeNode root = new TreeNode(maxValue);
        root.left = findBiggest(nums, start, index);
        root.right = findBiggest(nums, index + 1, end);
        return root;
    }
}
