package EveryDay.April;

import java.util.HashSet;
import java.util.Set;

public class OneHundredFortyTwo_DetectCycle {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(-4);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        node4.next = node2;
        detectCycle(node1);
    }

    public static ListNode detectCycle(ListNode head) {
//        ListNode p = head;
//        Set<Integer> set = new HashSet<>();
//        while (!set.contains(p.hashCode())){
//            set.add(p.hashCode());
//            if(p.next==null) return null;
//            p = p.next;
//        }
//        return p;
        ListNode fast = head, slow = head;
        int count = 0,len = 0;
        while (count < 2) {
            if (fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            if(count==1) ++len;
            if(slow==fast) ++count;
        }
        ListNode cur =
        for(int )
    }
}
