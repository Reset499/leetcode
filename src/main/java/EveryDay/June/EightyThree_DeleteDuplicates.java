package EveryDay.June;

public class EightyThree_DeleteDuplicates {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode cur = head;
        while(cur.next!=null){
            if(cur.next.val==cur.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
