package problems.leetcode.grind75.string;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.remove(s.charAt(i))) {
                counter += 2;
            }
            else {
                set.add(s.charAt(i));
            }
        }
        return set.isEmpty() ? counter : counter + 1;
    }
}
