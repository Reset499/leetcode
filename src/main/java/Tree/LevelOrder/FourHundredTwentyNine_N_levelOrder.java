package Tree.LevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FourHundredTwentyNine_N_levelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int len = queue.size();
            while (len != 0) {
                Node tempNode = queue.poll();
                for(Node node:tempNode.children){
                    queue.offer(node);
                }
                list.add(tempNode.val);
                len--;
            }
            result.add(list);
        }
        return result;
    }
}
