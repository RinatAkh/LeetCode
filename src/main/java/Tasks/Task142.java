package Tasks;

public class Task142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        int cycleLength = 0;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                cycleLength = calculateCycleLength(slow);
                break;
            }
        }
        if (cycleLength == 0) {
            return null;
        }

        return findStart(head, cycleLength);
    }

    private ListNode findStart(ListNode head, int cycleLength) {
        ListNode pointer1 = head, pointer2 = head;
        while (cycleLength > 0) {
            pointer2 = pointer2.next;
            cycleLength--;
        }

        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }

    private int calculateCycleLength(ListNode slow) {
        ListNode current = slow;
        int cycleLength = 0;
        do {
            current = current.next;
            cycleLength++;
        } while (current != slow);
        return cycleLength;
    }
}
