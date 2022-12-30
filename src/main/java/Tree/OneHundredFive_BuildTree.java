package Tree;

import java.util.HashMap;
import java.util.Map;

public class OneHundredFive_BuildTree {
    public static void main(String[] args) {
        int[] arr1 = {3,9,20,15,7};
        int[] arr2 = {9,3,15,20,7};
        buildTree(arr1,arr2);
    }

    static Map<Integer, Integer> map;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public static TreeNode findNode(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart >= preEnd || inStart >= inEnd) return null;
        int nodeIndex = map.get(preorder[preStart]);
        TreeNode root = new TreeNode(inorder[nodeIndex]);
        int leftLength = nodeIndex - inStart;
        root.left = findNode(preorder, preStart + 1, preStart + leftLength + 1, inorder, inStart, nodeIndex);
        root.right = findNode(preorder, preStart + leftLength + 1, preEnd, inorder, nodeIndex + 1, inEnd);
        return root;
    }
}
