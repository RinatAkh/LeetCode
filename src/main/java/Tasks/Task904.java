package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task904 {
    public int totalFruit(int[] fruits) {
        int windowStart = 0, maxLength = 0;
        Map<Integer, Integer> fruitsFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
            fruitsFrequencyMap.put(fruits[windowEnd], fruitsFrequencyMap.getOrDefault(fruits[windowEnd], 0) + 1);

            while (fruitsFrequencyMap.size() > 2) {
                fruitsFrequencyMap.put(fruits[windowStart], fruitsFrequencyMap.get(fruits[windowStart]) - 1);
                if (fruitsFrequencyMap.get(fruits[windowStart]) == 0) {
                    fruitsFrequencyMap.remove(fruits[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
