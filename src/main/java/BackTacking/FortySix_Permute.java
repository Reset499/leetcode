package BackTacking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FortySix_Permute {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        backTracing(nums, nums.length);
        return result;
    }

    public void backTracing(int[] nums, int k) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) continue;
            path.add(nums[i]);
            backTracing(nums,k);
            path.removeLast();
        }
    }
}
