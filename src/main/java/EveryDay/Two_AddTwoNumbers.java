package EveryDay;

import java.util.List;

public class Two_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int add = 0, val = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                val = l2.val + add;
                l2 = l2.next;
            } else if (l2 == null) {
                val = l1.val + add;
                l1 = l1.next;
            } else {
                val = l1.val + l2.val + add;
                l1 = l1.next;
                l2 = l2.next;
            }
            add = val / 10;
            ListNode node = new ListNode(val % 10);
            cur.next = node;
            cur = node;
        }
        if(add!=0) cur.next = new ListNode(add);
        return result.next;
    }
}
