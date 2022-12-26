package Tree.LevelOrder;

import java.util.LinkedList;
import java.util.Queue;

public class OneHundredSixteen_Connect {
    public static void main(String[] args) {

    }

    public NodeNext connect(NodeNext root) {
        Queue<NodeNext> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len > 0) {
                NodeNext temp = queue.poll();
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                len--;
                if (len != 0) temp.next = queue.peek();
            }
        }
        return root;
    }
}
