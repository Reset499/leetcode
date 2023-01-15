package BackTacking;

import java.lang.reflect.Array;
import java.util.*;

public class FourHundredNinetyOne_FindSubsequences {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();


    public List<List<Integer>> findSubsequences(int[] nums) {
        for (int i = 2; i <= nums.length; i++) {
            backTracing(nums, i, 0);
        }
        return result;
    }

    public void backTracing(int[] nums, int k, int startIndex) {
        Map<Integer, Integer> map = new HashMap<>();
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (map.containsKey(nums[i]) || (!path.isEmpty() && nums[i] < path.getLast())) continue;
            path.add(nums[i]);
            map.put(nums[i], 0);
            backTracing(nums, k, i + 1);
            path.removeLast();
        }
    }
}
