package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task76 {
    public String minWindow(String str, String pattern) {
        int windowStart = 0;
        int matched = 0;
        int minLength = str.length() + 1;
        int subStrStart = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            charFrequencyMap.put(pattern.charAt(i), charFrequencyMap.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char charRight = str.charAt(windowEnd);
            if(charFrequencyMap.containsKey(charRight)) {
                charFrequencyMap.put(charRight, charFrequencyMap.get(charRight) - 1);
                if(charFrequencyMap.get(charRight) >= 0) {
                    matched++;
                }
            }

            while (matched == pattern.length()) {
                if(minLength > windowEnd - windowStart + 1) {
                    minLength = windowEnd - windowStart + 1;
                    subStrStart = windowStart;
                }
                char leftChar = str.charAt(windowStart++);
                if(charFrequencyMap.containsKey(leftChar)) {
                    if(charFrequencyMap.get(leftChar) == 0) {
                        matched--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        return minLength > str.length() ? "" : str.substring(subStrStart, subStrStart + minLength);
    }
}
