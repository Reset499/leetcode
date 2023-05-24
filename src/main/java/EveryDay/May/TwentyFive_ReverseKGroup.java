package EveryDay.May;

import java.awt.geom.FlatteningPathIterator;

public class TwentyFive_ReverseKGroup {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        reverseKGroup(node1,2);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur, temp, pre, result = new ListNode(0, head);
        //三个用于反转链表的node
        cur = temp = pre = head;
        //用于记录已翻转后的链表的结尾
        ListNode end = new ListNode();
        boolean flag = true;
        while (true) {
            //因为前面的链表已经翻转过,所以pre要从接下来未反转的链表开始找,所以要重新赋值
            pre = cur;
            //往前k个找pre
            for (int i = 0; i < k; i++) {
                if (pre == null) return result.next;
                pre = pre.next;
            }
            //进行翻转
            for (int i = 0; i < k; i++) {
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            //记录第一次翻转后的头作为result
            if (flag) {
                result.next = pre;
                flag = false;
            }
            //将前面翻转后的链表与这一次while循环翻转的链表接上
            end.next = pre;
            //再将end前移k位,找到新的已翻转好的链表的end
            for(int i = 0;i<k;i++) end = end.next;
        }
    }
}
