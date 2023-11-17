package problems.leetcode.grind75.dynamicprogramming;


public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int currentSum = 0;
        int max = nums[0];

        for (int num : nums) {
            currentSum += num;
            max = Math.max(max, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return max;
    }
}
