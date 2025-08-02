package Tasks;

import java.util.Map;

public class Task209 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6};
        int result = minSubArrayLen(10, nums);
        System.out.println(result);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0, result = Integer.MAX_VALUE, windowStart = 0;
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            sum += nums[windowEnd];
            while (sum >= target) {
                result = Math.min(result, windowEnd - windowStart + 1);
                sum -= nums[windowStart];
                windowStart++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
