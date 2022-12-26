package Tree.LevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FiveHundredFifteen_LargestValues {
    public static void main(String[] args) {

    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            int maxValue = queue.peek().val;
            while (len > 0) {
                TreeNode temp = queue.poll();
                maxValue = temp.val > maxValue ? temp.val : maxValue;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                len--;
            }
            result.add(maxValue);
        }
        return result;
    }
}
