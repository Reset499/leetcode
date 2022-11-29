package Tree.LevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OneHundredNinetyNine_RightSideView {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len != 0) {
                TreeNode tempNode = queue.poll();
                if(tempNode.left!=null)queue.offer(tempNode.left);
                if(tempNode.right!=null) queue.offer(tempNode.right);
                len--;
                if(len == 0) result.add(tempNode.val);
            }
        }
        return result;
    }
}
