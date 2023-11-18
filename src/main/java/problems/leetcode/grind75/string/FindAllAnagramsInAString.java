package problems.leetcode.grind75.string;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        if (s.isEmpty() || p.isEmpty() || p.length() > s.length()) return Collections.emptyList();
        List<Integer> result = new LinkedList<>();
        int[] anagramCount = new int[26];
        int[] windowCount = new int[26];

        for (char c : p.toCharArray()) {
            anagramCount[c - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i + p.length() - 1 < s.length(); i++) {
            if (i != 0) {
                windowCount[s.charAt(i - 1) - 'a']--;
                windowCount[s.charAt(i + p.length() - 1) - 'a']++;
            }
            if (check(anagramCount, windowCount)) result.add(i);

        }

        return result;
    }

    private boolean check(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
