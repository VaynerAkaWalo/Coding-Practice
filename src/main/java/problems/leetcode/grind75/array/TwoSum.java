package problems.leetcode.grind75.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numAndIndex = new HashMap<>();

        for (int i =0; i < nums.length; i++) {
            if (numAndIndex.containsKey(target - nums[i])) {
                return new int[] {i, numAndIndex.get(target - nums[i])};
            }
            numAndIndex.put(nums[i], i);
        }

        return new int[] {};
    }
}
