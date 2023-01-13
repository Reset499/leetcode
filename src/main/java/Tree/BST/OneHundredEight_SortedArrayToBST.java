package Tree.BST;

public class OneHundredEight_SortedArrayToBST {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if (length == 0) return null;
        return traversal(nums, 0, length - 1);
    }

    public TreeNode traversal(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traversal(nums,left,mid-1);
        root.right = traversal(nums,mid+1,right);
        return root;
    }
}
