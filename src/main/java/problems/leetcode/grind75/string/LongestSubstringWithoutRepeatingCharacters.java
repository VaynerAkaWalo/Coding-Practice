package problems.leetcode.grind75.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        int low = 0;
        int max = 1;

        set.add(s.charAt(low));
        for (int high = 1; high < s.length(); high++) {
            char highChar = s.charAt(high);
            while(set.contains(highChar)) {
                set.remove(s.charAt(low));
                low++;
            }
            set.add(highChar);
            max = Math.max(max, set.size());
        }

        return max;
    }
}
