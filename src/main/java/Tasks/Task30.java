package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task30 {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordsFrequencyMap = new HashMap<>();
        for(String word : words) {
            wordsFrequencyMap.put(word, wordsFrequencyMap.getOrDefault(word, 0) + 1);
        }

        List<Integer> resultIndices = new ArrayList<>();
        int wordsCount = words.length, wordLength = words[0].length();
        for(int i = 0; i <= s.length() - wordsCount * wordLength; i++) {
            Map<String, Integer> wordsSeen = new HashMap<>();
            for (int j = 0; j < wordsCount; j++) {
                int nextWordIndex = i + j * wordLength;
                String word = s.substring(nextWordIndex, nextWordIndex + wordLength);
                if(!wordsFrequencyMap.containsKey(word)) {
                    break;
                }
                wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);

                if (wordsSeen.get(word) > wordsFrequencyMap.get(word)) {
                    break;
                }
                if(j + 1 == wordsCount) {
                    resultIndices.add(i);
                }
            }
        }
        return resultIndices;
    }
}
