package Tasks;

import java.util.Arrays;

public class Task1011 {
    public int shipWithinDays(int[] weights, int days) {
        int maxValue = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();
        int left = maxValue;
        int right = sum;

        while(left < right) {
            int mid = (left + right) / 2;
            int currentWeight = 0;
            int daysNeeded = 1;

            for(int i = 0; i < weights.length; i++) {
                if(currentWeight + weights[i] > mid) {
                    daysNeeded = daysNeeded + 1;
                    currentWeight = 0;
                }
                currentWeight += weights[i];
            }
            if(daysNeeded > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
