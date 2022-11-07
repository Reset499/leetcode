package LinkedList;

public class OneHundredSixty_GetIntersectionNode {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(5, null);
        ListNode listNode2 = new ListNode(4, listNode3);
        ListNode listNode1 = new ListNode(8, listNode2);
        ListNode listNode03 = new ListNode(1, listNode1);
        ListNode listNode02 = new ListNode(6, listNode03);
        ListNode listNode01 = new ListNode(5, listNode02);
        ListNode listNode12 = new ListNode(1,listNode1);
        ListNode listNode11 = new ListNode(4,listNode12);
        getIntersectionNode(listNode01, listNode11);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode countA = headA;
        ListNode countB = headB;
        while (countA != null) {
            ++lenA;
            countA= countA.next;
        }
        while (countB != null) {
            ++lenB;
            countB = countB.next;
        }
        if (lenA > lenB) {
            int abs = lenA - lenB;
            for (int i = 0; i < abs; i++) headA = headA.next;
        } else {
            int abs = lenB - lenA;
            for (int i = 0; i < abs; i++) headB = headB.next;
        }
        while (headA != null && headB != null) {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
