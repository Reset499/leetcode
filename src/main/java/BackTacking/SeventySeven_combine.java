package BackTacking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SeventySeven_combine {
    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTacking(n, k, 1);
        return result;
    }

    public void backTacking(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            backTacking(n,k,i+1);
            path.removeLast();
        }
    }
}
