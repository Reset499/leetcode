package Tree.Recursion;

import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.Map;

public class OneHundredSix_BuildTree {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        if (inBegin >= inEnd || postBegin >= postEnd) return null;
        int nodeIndex = map.get(postorder[postEnd-1]);
        TreeNode root = new TreeNode(inorder[nodeIndex]);
        int leftLength = nodeIndex - inBegin;
        root.left = findNode(inorder,inBegin,nodeIndex,postorder,postBegin,postBegin+leftLength);
        root.right = findNode(inorder,nodeIndex+1,inEnd,postorder,postBegin+leftLength,postEnd-1);
        return root;
    }
}
