package Tree.LevelOrder;

import java.util.*;

public class OneHundredSeven_LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            while (len != 0) {
                TreeNode tempNode = queue.poll();
                list.add(tempNode.val);
                if (tempNode.left != null) queue.offer(tempNode.left);
                if (tempNode.right != null) queue.offer(tempNode.right);
                len--;
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }
}
