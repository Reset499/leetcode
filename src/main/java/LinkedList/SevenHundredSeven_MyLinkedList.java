package LinkedList;

public class SevenHundredSeven_MyLinkedList {
    public static void main(String[] args) {

    }

    class MyLinkedList {
        int size;

        //dummy head;
        ListNode head;

        //initialize the linkedList
        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        public int get(int index) {
            int count = -1;
            ListNode temp = head;
            while (count < index) {
                if (temp.next == null) return -1;
                temp = temp.next;
                count++;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index > size) return;
            if (index < 0) index = 0;
            ListNode toAdd = new ListNode(val);
            ListNode temp = head;
            int count = 0;
            while (count < index) {
                temp = temp.next;
                count++;
            }
            toAdd.next = temp.next;
            temp.next = toAdd;
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index >= size || index < 0) return;
            ListNode temp = head;
            int count = 0;
            while (count < index) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
}
