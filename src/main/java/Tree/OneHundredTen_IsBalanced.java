package Tree;

import java.time.chrono.IsoChronology;

public class OneHundredTen_IsBalanced {
    public static void main(String[] args) {
        TreeNode treeNode8  = new TreeNode(8);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4,treeNode7,treeNode8);
        TreeNode treeNode3 = new TreeNode(3,treeNode6,null);
        TreeNode treeNode2 = new TreeNode(2,treeNode4,treeNode5);
        TreeNode treeNode1 = new TreeNode(1,treeNode2,treeNode3);
        System.out.println(isBalanced(treeNode1));
    }

    public static boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private static int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
