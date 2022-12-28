package Tree.Recursion;

import java.util.LinkedList;
import java.util.Queue;

public class OneHundredOne_IsSymmetric {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode right = queue.poll();
            TreeNode left = queue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null || left.val != right.val)
                return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }
}
