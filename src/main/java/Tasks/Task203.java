package Tasks;

public class Task203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode current = dummyHead;

        while(current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummyHead.next;
    }

    public ListNode removeElementsByRecursion(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        if(head.val == val) {
            return removeElementsByRecursion(head.next, val);
        } else {
            head.next = removeElementsByRecursion(head.next, val);
            return head;
        }
    }
}
