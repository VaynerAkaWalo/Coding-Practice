package problems.leetcode.grind75.dynamicprogramming;

import java.util.*;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int number : nums) {
            for (int i = target; i >= number; i--) {
                dp[i] = dp[i] || dp[i - number];
            }
        }

        return dp[target];
    }
}
