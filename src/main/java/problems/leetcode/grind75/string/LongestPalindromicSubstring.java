package problems.leetcode.grind75.string;

import java.util.PriorityQueue;
import java.util.Queue;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        Queue<String> substrings = new PriorityQueue<>((x, y) -> y.length() - x.length());

        for (int i = 0; i < s.length(); i++) {
            substrings.add(longestPalindrome(i, s));
        }

        return substrings.remove();
    }

    private String longestPalindrome(int start, String s) {
        int low = start;
        int high = start;
        while (low - 1 > -1 && s.charAt(low - 1) == s.charAt(start)) {
            low--;
        }

        while (high + 1 < s.length() && s.charAt(high + 1) == s.charAt(start)) {
            high++;
        }

        while(low - 1 > -1 && high + 1 < s.length() && s.charAt(low - 1) == s.charAt(high + 1)) {
            high++;
            low--;
        }

        return s.substring(low, high + 1);
    }
}
