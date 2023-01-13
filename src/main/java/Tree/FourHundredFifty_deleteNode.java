package Tree;

public class FourHundredFifty_deleteNode {
    public static void main(String[] args) {

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (root.val == key) {
            if (root.left == null && root.right == null) return null;
            if (root.left == null && root.right != null) return root.right;
            if (root.right == null && root.left != null) return root.left;
            if (root.left != null && root.right != null) {
                TreeNode temp = root.right;
                while(temp.left!=null) {temp = temp.left;}
                temp.left = root.left;
                return root.right;
            }
        } else {
            root.left = deleteNode(root.left, key);
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
