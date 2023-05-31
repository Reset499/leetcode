package EveryDay.May;

import java.util.*;

public class OneThousandOneHundredTen {
    public static void main(String[] args) {

    }

    List<TreeNode> result = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int n : to_delete) set.add(n);
        result.add(dfs(root,root));
        return result;
    }

    public TreeNode dfs(TreeNode cur, TreeNode root) {
        if (cur == null) return null;
        if (set.contains(cur.val)) {
            cur.left = dfs(cur.left, cur.left);
            if (cur.left != null) result.add(cur.left);
            cur.right = dfs(cur.right, cur.right);
            if (cur.right != null) result.add(cur.right);
            return null;
        } else {
            cur.left = dfs(cur.left, root);
            cur.right = dfs(cur.right, root);
        }
        return cur;
    }
}