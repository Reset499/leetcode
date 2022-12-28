package Tree;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TwoHundredTwentySix_InvertTree {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len > 0) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                TreeNode temp1 = temp.left;
                temp.left = temp.right;
                temp.right = temp1;
                len--;
            }
        }
        return root;
    }
}
