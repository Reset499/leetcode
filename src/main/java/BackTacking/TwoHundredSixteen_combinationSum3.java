package BackTacking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TwoHundredSixteen_combinationSum3 {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracing(k, n, 1);
        return result;
    }

    public void backTracing(int k, int n, int startIndex) {
        int size = path.size();
        if (size == k) {
            int sum = 0;
            for (int i = 0; i < size; i++) sum += path.get(i);
            if (sum == n) result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= 9 - (k - size) + 1; i++) {
            path.add(i);
            backTracing(k, n, i + 1);
            path.removeLast();
        }
    }
}
