package problems.leetcode.grind75.string;


public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) return true;

        int[] array = s
                .codePoints()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .toArray();

        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            if (array[low] != array[high]) return false;
            low++;
            high--;
        }

        return true;
    }
}
