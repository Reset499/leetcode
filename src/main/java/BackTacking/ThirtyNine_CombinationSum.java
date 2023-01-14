package BackTacking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThirtyNine_CombinationSum {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracing(candidates, target, 0, 0);
        return result;
    }

    public void backTracing(int[] candidates, int target, int num, int startIndex) {
        if (num == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (num + candidates[i] > target) break;
            path.add(candidates[i]);
            backTracing(candidates, target, num + candidates[i], i);
            path.removeLast();
        }
    }
}
