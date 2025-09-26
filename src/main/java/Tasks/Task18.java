package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> quadruplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            for(int j = i + 1; j < nums.length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                searchForPair(nums, target, i, j, quadruplets);
            }
        }
        return quadruplets;
    }

    private void searchForPair(int[] nums, int target, int first, int second, List<List<Integer>> quadruplets) {
        int left = second + 1;
        int right = nums.length - 1;
        while (left < right) {
            long sum = (long )nums[first] + nums[second] + nums[left] + nums[right];
            if(sum == target) {
                quadruplets.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
