package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class FiveHundredThirty_GetMinimumDifference {
    public static void main(String[] args) {

    }

    TreeNode pre;
    int result = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;
        traversal(root);
        return result;
    }
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(pre!=null) result = Math.min(result,root.val-pre.val);
        pre = root;
        traversal(root.right);
    }
}
