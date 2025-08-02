import java.util.HashMap;
import java.util.Map;

public class Task904 {
    public int fruitsIntoBaskets(char[] array) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> fruitsFrequencyMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            fruitsFrequencyMap.put(array[windowEnd], fruitsFrequencyMap.getOrDefault(array[windowEnd],0) + 1);

            while (fruitsFrequencyMap.size() > 2) {
                fruitsFrequencyMap.put(array[windowStart], fruitsFrequencyMap.get(array[windowStart]) - 1);
                if(fruitsFrequencyMap.get(array[windowStart]) == 0) {
                    fruitsFrequencyMap.remove(array[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
