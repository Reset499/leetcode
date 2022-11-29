package Tree.LevelOrder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SixHundredThirtySeven_AverageOfLevels {
    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> result = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            double count = queue.size();
            int len = queue.size();
            double levelSum = 0.0;
            while (len != 0) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left != null) queue.offer(tempNode.left);
                if (tempNode.right != null) queue.offer(tempNode.right);
                levelSum += tempNode.val;
                len--;
            }
            result.add(levelSum / count);
        }
        return result;
    }
}
