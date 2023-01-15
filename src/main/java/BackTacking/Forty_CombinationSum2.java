package BackTacking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Forty_CombinationSum2 {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracing(candidates, target, 0, 0);
        return result;
    }

    public void backTracing(int[] candidates, int target, int sum, int startIndex) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex&&candidates[i] == candidates[i-1]) continue;
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backTracing(candidates, target, sum + candidates[i], i + 1);
            path.removeLast();
        }
    }
}
