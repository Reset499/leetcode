package Tree.LevelOrder;

import java.util.LinkedList;
import java.util.Queue;

public class OneHundredEleven_MinDepth {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            result++;
            int len = queue.size();
            while (len > 0) {
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right==null) return result;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                len--;
            }
        }
        return result;
    }
}
