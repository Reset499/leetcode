package Tree;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;

public class TwoHundredFiftySeven_binaryPaths {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        List<Integer> list = new ArrayList<>();
        traversal(root, list, result);
        return result;
    }

    public void traversal(TreeNode root, List<Integer> list, List<String> result) {
        list.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(list.get(0));
            for (int i = 1; i < list.size(); i++)
                stringBuilder.append("->").append(list.get(i));
            result.add(stringBuilder.toString());
            return;
        }
        if (root.left != null) {
            traversal(root.left, list, result);
            list.remove(list.size() - 1);
        }
        if (root.right != null) {
            traversal(root.right, list, result);
            list.remove(list.size() - 1);
        }
    }
}
