package problems.leetcode.grind75.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> occurred = new HashSet<>();

        for (int num : nums) {
            if (!occurred.add(num)) {
                return true;
            }
        }

        return false;
    }
}
