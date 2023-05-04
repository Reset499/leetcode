package EveryDay.May;

public class TwentyThree_MergeKLists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null||lists.length==0) return null;
        return merge(0,lists.length-1,lists);
    }

    public ListNode merge(int left, int right, ListNode[] listNodes) {
        //若范围缩小到只有一个 则直接拿取这个 return 这个list
        if (right == left) return listNodes[left];
        int mid = (left + right) / 2;
        //拿取左右的合并好的ListNode
        ListNode leftNode = merge(left, mid, listNodes);
        ListNode rightNode = merge(mid + 1, right, listNodes);
        //合并两个链表
        ListNode pre = new ListNode(0, leftNode);
        ListNode result = pre;
        while (leftNode != null && rightNode != null) {
            if (leftNode.val > rightNode.val) {
                pre.next = rightNode;
                rightNode = rightNode.next;
                pre = pre.next;
                pre.next = leftNode;
            } else {
                pre = leftNode;
                leftNode = leftNode.next;
            }
        }
        if (leftNode == null) {
            pre.next = rightNode;
        }
        return result.next;
    }
}
