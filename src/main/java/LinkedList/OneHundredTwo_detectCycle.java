package LinkedList;

import java.util.HashMap;
import java.util.Hashtable;

public class OneHundredTwo_detectCycle {
    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(4,null);
        ListNode listNode2 = new ListNode(0, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode0 = new ListNode(3, listNode1);
        listNode3.next = listNode1;
        detectCycle(listNode0);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode, Integer> hashtable = new HashMap<ListNode,Integer>();
        int i = 0;
        while (temp != null) {
            if(hashtable.containsKey(temp)) return temp;
            hashtable.put(temp, i++);
            temp = temp.next;
        }
        return null;
    }
}
