package Tree;

import java.util.ArrayList;


public class FiveHundredOne_FindMode {
    public static void main(String[] args) {

    }
    ArrayList<Integer> resList = new ArrayList<>();
    TreeNode pre;
    int max = 0, count = 0;

    public int[] findMode(TreeNode root) {
        if(root == null) return null;
        traversal(root);
        int result[] = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            result[i] = resList.get(i);
        }
        return result;
    }

    public void traversal(TreeNode root) {
        if (root == null) return;
        traversal(root.left);
        if (pre != null) {
            count = root.val == pre.val ? count + 1 : 1;
        } else count = 1;
        if(count>max){
            resList.clear();
            resList.add(root.val);
            max = count;
        }else if(count == max) resList.add(root.val);
        pre = root;
        traversal(root.right);
    }
}
