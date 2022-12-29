package Tree;

public class OneHundredTwelve_HasPathSum {
    public static void main(String[] args) {

    }
    private boolean result = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) result = true;
        }
        if (root.left != null) hasPathSum(root.left, targetSum - root.val);
        if (root.right != null) hasPathSum(root.right, targetSum - root.val);
        return result;
    }
}
