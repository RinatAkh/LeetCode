package Tasks;

public class Task234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode headSecondHalf = reverse(slow);
        ListNode headSecondHalfCopy = headSecondHalf;

        while (head != null && headSecondHalf != null) {
            if (head.val != headSecondHalf.val) {
                break;
            }
            head = head.next;
            headSecondHalf = headSecondHalf.next;
        }

        reverse(headSecondHalfCopy);

        if (head == null || headSecondHalf == null)
            return true;
        return false;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
