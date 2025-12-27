package Tasks;

public class Task574 {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isForward = nums[i] > 0;
            int slow = i, fast = i;

            while (true) {
                slow = next(nums, isForward, slow);
                if (slow == -1) break;

                fast = next(nums, isForward, fast);
                if (fast == -1) break;
                fast = next(nums, isForward, fast);
                if (fast == -1) break;

                if (slow == fast) return true;
            }
        }
        return false;
    }

    private int next(int[] nums, boolean isForward, int current) {
        boolean direction = nums[current] > 0;
        if (isForward != direction) return -1;

        int n = nums.length;
        int next = (current + nums[current]) % n;
        if (next < 0) next += n;
        if (next == current) return -1;

        return next;
    }
}
