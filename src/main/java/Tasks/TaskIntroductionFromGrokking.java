package Tasks;

import java.util.Arrays;

public class TaskIntroductionFromGrokking {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2};
        double[] result = returnAverageFromArraySizeK(nums, 5);
        System.out.println(Arrays.toString(result));
    }


    public static double[] returnAverageFromArraySizeK(int[] nums, int K) {
        int windowStart = 0;
        double sum = 0;
        double[] result = new double[nums.length - K + 1];
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            sum += nums[windowEnd];
            if(windowEnd >= K - 1) {
                result[windowStart] = sum / K;
                sum -= nums[windowStart];
                windowStart++;
            }
        }
        return result;
    }

}
