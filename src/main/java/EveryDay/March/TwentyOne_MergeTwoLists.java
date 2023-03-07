package EveryDay.March;

public class TwentyOne_MergeTwoLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0,list1);
        ListNode preA = result, curA = list1, curB = list2;
        while (curB != null&&curA!=null) {
            if(curB.val<curA.val){
                preA.next = curB;
                curB = curB.next;
                preA = preA.next;
                preA.next = curA;
            }else {
                preA = curA;
                curA = curA.next;
            }
        }
        if(curA==null) preA.next = curB;
        return result.next;
    }
}
