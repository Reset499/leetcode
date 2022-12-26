package Tree.LevelOrder;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class OneHundredFour_MaxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            result++;
            int len = queue.size();
            while (len > 0) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                len--;
            }
        }
        return result;
    }
}
