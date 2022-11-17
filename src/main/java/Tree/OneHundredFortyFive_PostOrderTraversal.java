package Tree;

import java.util.ArrayList;
import java.util.List;

public class OneHundredFortyFive_PostOrderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root,result);
        return result;
    }
    public void postOrder(TreeNode root,List<Integer> result){
        if(root == null) return;
        postOrder(root.left,result);
        postOrder(root.right,result);
        result.add(root.val);
    }
}
