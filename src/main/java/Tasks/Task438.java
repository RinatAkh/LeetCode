package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task438 {
    public List<Integer> findAnagrams(String str, String pattern) {
        int windowStart = 0;
        int matched = 0;
        Map<Character,Integer> charFrequencyMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            charFrequencyMap.put(pattern.charAt(i), charFrequencyMap.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        List<Integer> resultIndices = new ArrayList<>();
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            if(charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if(charFrequencyMap.get(rightChar) == 0) {
                    matched++;
                }
            }

            if(matched == charFrequencyMap.size()) {
                resultIndices.add(windowStart);
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
        return resultIndices;
    }
}
