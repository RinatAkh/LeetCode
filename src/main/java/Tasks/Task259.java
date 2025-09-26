package Tasks;

import java.util.Arrays;

public class Task259 {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            count += searchForPair(nums, target - nums[i], i);
        }
        return count;
        }

    private int searchForPair(int[] nums, int targetSum, int first) {
        int count = 0;
        int left = first + 1;
        int right = nums.length - 1;

        while (left < right) {
            if(nums[left] + nums[right] < targetSum) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
