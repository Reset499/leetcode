package Tree.BST;

import Tree.BST.TreeNode;

public class SevenHundred_SearchBST {
    public static void main(String[] args) {

    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null||root.val == val) return root;
        if(val > root.val) root = searchBST(root.right,val);
        else if(val < root.val) root = searchBST(root.left,val);
        return root;
    }
}
