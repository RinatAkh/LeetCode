package Tasks;

public class Task1004 {
    public int longestOnes(int[] nums, int k) {
        int windowStart = 0;
        int maxLength = 0;
        int onesCount = 0;

        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if(nums[windowEnd] == 1) {
                onesCount++;
            }

            if(windowEnd - windowStart + 1 - onesCount > k) {
                if(nums[windowStart] == 1) {
                    onesCount--;
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
