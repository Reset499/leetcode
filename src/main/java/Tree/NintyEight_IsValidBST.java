package Tree;

public class NintyEight_IsValidBST {
    public static void main(String[] args) {
//        TreeNode root3 = new TreeNode(3);
//        TreeNode root2 = new TreeNode(1);
        TreeNode root1 = new TreeNode(0);
        System.out.println(isValidBST(root1));
    }

    static boolean result = true;

    public static boolean isValidBST(TreeNode root) {
        if(root == null) return result;
        isValid(root);
        return result;
    }

    public static void isValid(TreeNode root) {
        if (root.left == null && root.right == null) return;
        if (root.left != null) {
            if (root.left.val >= root.val) {
                result = false;
                return;
            } else isValid(root.left);

        }
        if (root.right != null) {
            if (root.right.val <= root.val) {
                result = false;
                return;
            } else isValid(root.right);
        }
    }
}
