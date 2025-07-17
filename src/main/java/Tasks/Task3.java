package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);

            if(charFrequencyMap.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, charFrequencyMap.get(rightChar) + 1);
            }

            charFrequencyMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

}
