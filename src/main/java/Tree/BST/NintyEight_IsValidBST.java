package Tree.BST;

import Tree.BST.TreeNode;

public class NintyEight_IsValidBST {
    public static void main(String[] args) {

    }

    static TreeNode max;
    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        // 中
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        // 右
        boolean right = isValidBST(root.right);
        return right;
    }
}
