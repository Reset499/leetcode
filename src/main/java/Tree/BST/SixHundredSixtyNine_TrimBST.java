package Tree.BST;


public class SixHundredSixtyNine_TrimBST {
    public static void main(String[] args) {

    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        if (root.val < low) {
            root.right = trimBST(root.right, low, high);
            return root.right;
        } else if (root.val > high) {
            root.left = trimBST(root.left, low, high);
            return root.left;
        } else {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }
        return root;
    }
}
