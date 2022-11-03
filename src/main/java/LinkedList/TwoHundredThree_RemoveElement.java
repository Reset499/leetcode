package LinkedList;

public class TwoHundredThree_RemoveElement {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(0);
        ListNode listNode3 = new ListNode(0,listNode4);
        ListNode listNode2 = new ListNode(0,listNode3);
        ListNode listNode1 = new ListNode(6,listNode2);
        removeElements(listNode1,6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0, head);
        ListNode temp = newHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return newHead.next;
    }
}
