package EveryDay.April;

public class SixtyOne_RotateRight {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            if (fast.next == null) fast = head;
            else fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
