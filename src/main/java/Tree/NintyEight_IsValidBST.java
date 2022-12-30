package Tree;

public class NintyEight_IsValidBST {
    public static void main(String[] args) {
        TreeNode root5 = new TreeNode(20);
        TreeNode root4 = new TreeNode(6);
        TreeNode root3 = new TreeNode(15,root4,root5);
        TreeNode root2 = new TreeNode(5);
        TreeNode root1 = new TreeNode(10,root2,root3);
        System.out.println(isValidBST(root1));
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
