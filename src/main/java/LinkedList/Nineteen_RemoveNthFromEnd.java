package LinkedList;

public class Nineteen_RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4,listNode5);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        removeNthFromEnd(listNode1, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode pointer = dummyHead;
        ListNode temp = dummyHead;
        for (int i = 0; i < n; i++) {
            if (pointer.next == null) return null;
            pointer = pointer.next;
        }
        while (pointer != null && pointer.next != null) {
            pointer = pointer.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummyHead.next;
    }
}
