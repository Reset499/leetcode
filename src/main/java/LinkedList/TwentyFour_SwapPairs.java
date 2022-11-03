package LinkedList;

public class TwentyFour_SwapPairs {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        swapPairs(listNode1);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode before = head;
        ListNode after = head.next;
        ListNode dummyHead = new ListNode(0, head);
        ListNode cur = dummyHead;
        while (cur != null) {
            cur.next = after;
            before.next = after.next;
            after.next = before;
            if(before.next == null||before.next.next == null) break;
            before = before.next;
            after = before.next;
            cur = cur.next.next;
        }
        return dummyHead.next;
    }
}
