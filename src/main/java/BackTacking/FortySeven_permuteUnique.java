package BackTacking;

import java.lang.reflect.Array;
import java.util.*;

public class FortySeven_permuteUnique {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backTracing(nums, used);
        return result;
    }

    public void backTracing(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) continue;
            if (used[i] == false) {
                path.add(nums[i]);
                used[i] = true;
                backTracing(nums,used);
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
