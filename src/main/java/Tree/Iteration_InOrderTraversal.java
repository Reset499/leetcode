package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Iteration_InOrderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.peek();
            if(node!=null){
                stack.pop();
                if(node.right!= null) stack.push(node.right);
                stack.push(node);
                stack.push(null);
                if(node.left!=null) stack.push(node.left);
            }else{
                stack.pop();
                node = stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }
}
