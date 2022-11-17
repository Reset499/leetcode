package Tree;

import java.util.ArrayList;
import java.util.List;

public class NintyFour_InOrderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root,result);
        return result;
    }
    public void inOrder(TreeNode root,List<Integer> result){
        if(root == null) return;
        inOrder(root.left,result);
        result.add(root.val);
        inOrder(root.right,result);
    }
}
