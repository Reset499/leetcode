package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class FiveHundredThirteen_FindBottomLeftValue {
    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2, treeNode2, treeNode3);
        System.out.println(findBottomLeftValue(treeNode1));
    }

    public static int findBottomLeftValue(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            result = queue.peek().val;
            while (len > 0) {
                TreeNode temp = queue.poll();
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                len--;
            }
        }
        return result;
    }
}

