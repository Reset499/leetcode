package BackTacking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SeventyEight_Subsets {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            backTracing(nums, i, 0);
        }
        return result;
    }

    public void backTracing(int[] nums, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backTracing(nums, k, i + 1);
            path.removeLast();
        }
    }
}
