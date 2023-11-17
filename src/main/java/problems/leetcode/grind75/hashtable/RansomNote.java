package problems.leetcode.grind75.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> lettersAndOccurrences = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            lettersAndOccurrences.merge(magazine.charAt(i), 1, Integer::sum);
            if (i < ransomNote.length()) {
                lettersAndOccurrences.merge(ransomNote.charAt(i), -1, Integer::sum);
            }
        }

        for (int value : lettersAndOccurrences.values()) {
            if (value < 0) return false;
        }

        return true;
    }
}
