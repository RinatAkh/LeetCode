package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task567 {
    public boolean checkInclusion(String str, String pattern) {
        int windowStart = 0, matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            charFrequencyMap.put(pattern.charAt(i), charFrequencyMap.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if(charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if(charFrequencyMap.get(rightChar) == 0) {
                    matched++;
                }
            }

            if(matched == charFrequencyMap.size()) {
                return true;
            }

            if(windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart);

                if(charFrequencyMap.containsKey(leftChar)) {
                    if(charFrequencyMap.get(leftChar) == 0) {
                        matched--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
                windowStart++;
            }
        }
        return false;
    }
}
