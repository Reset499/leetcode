package EveryDay.April;

import java.util.*;

public class OneHundredThree_ZigzagLevelOrder {
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(20,treeNode4,treeNode5);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(3,treeNode2,treeNode3);
        zigzagLevelOrder(treeNode1);
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                list.add(temp.val);
            }
            if (flag) Collections.reverse(list);
            flag = !flag;
            result.add(list);
        }
        return result;
    }
}
