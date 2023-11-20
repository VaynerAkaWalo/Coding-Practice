package problems.leetcode.leetcode75.arraystring.twopointers;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.isEmpty()) return true;

        int pointer = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pointer)) {
                pointer++;
                if (pointer == s.length()) return true;
            }
        }

        return false;
    }
}
