package Tasks;

import java.util.HashMap;

public class Task242 {
    public boolean isAnagram(String s, String t) {
        return isAnagram(putToHashMap(s), putToHashMap(t));
    }

    public HashMap<Character, Integer> putToHashMap(String s) {
        HashMap<Character, Integer> forS = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            Integer value = forS.get(k);
            if(value == null) {
                forS.put(k, 1);
            } else {
                forS.put(k, value + 1);
            }
        }
        return forS;
    }

    public boolean isAnagram(HashMap<Character, Integer> s, HashMap<Character, Integer> k) {
        return s.equals(k);
    }
}
