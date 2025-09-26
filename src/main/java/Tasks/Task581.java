package Tasks;

public class Task581 {
    public int findUnsortedSubarray(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < nums.length - 1 && nums[low] <= nums[low + 1]) {
            low++;
        }

        // Если low оказался последним элементом значит массив отсортирован
        if(low == nums.length - 1)
            return 0;

        while ((high > 0 && nums[high] >= nums[high - 1])) {
            high--;
        }

        int subarrayMin = Integer.MAX_VALUE, subarrayMax = Integer.MIN_VALUE;
        for (int k = low; k <= high; k++) {
            subarrayMax = Math.max(subarrayMax, nums[k]);
            subarrayMin = Math.min(subarrayMin, nums[k]);
        }

        while (low > 0 && nums[low - 1] > subarrayMin) {
            low--;
        }

        while (high < nums.length - 1 && nums[high + 1] < subarrayMax) {
            high++;
        }
        return high - low + 1;
    }
}
