package problems.leetcode.leetcode75.arraystring.twopointers;

public class MoveZeroes {

    // 1  2, 0, 0, 5, 1, 0
    public void moveZeroes(int[] nums) {
        int zeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeroes++;

            if (nums[i] != 0 && zeroes > 0) {
                nums[i - zeroes] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
