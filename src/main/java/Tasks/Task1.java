package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int number = 0;
        for(int i = 0; i < nums.length; i++) {
            number = target - nums[i];
            if(map.containsKey(number)) {
                return new int[] {i, map.get(number)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
