package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task340 {
    public static int findLength(String str, int K) {
        if(str == null || str.length() == 0 || str.length() < K) {
            throw new IllegalArgumentException();
        }

        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightEnd = str.charAt(windowEnd);
            charFrequencyMap.put(rightEnd, charFrequencyMap.getOrDefault(rightEnd, 0) + 1);

            while (charFrequencyMap.size() > K) {
                char leftStart = str.charAt(windowStart);
                charFrequencyMap.put(leftStart, charFrequencyMap.get(leftStart) - 1);
                if(charFrequencyMap.get(leftStart) == 0) {
                    charFrequencyMap.remove(leftStart);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
