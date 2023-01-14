package Tree.BST;

public class FiveHundredThirtyEight_ConvertBST {
    public static void main(String[] args) {

    }

    int value = 0;

    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        return root;
    }

    public void traversal(TreeNode root) {
        if (root == null) return;
        traversal(root.right);
        root.val = value + root.val;
        value = root.val;
        traversal(root.left);
    }
}
