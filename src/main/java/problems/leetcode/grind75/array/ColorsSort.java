package problems.leetcode.grind75.array;

public class ColorsSort {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int num : nums) {
            if (num == 0) red++;
            if (num == 1) white++;
            if (num == 2) blue++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < red) {
                nums[i] = 0;
            } else if (i + red < white + red) {
                nums[i] = 1;
            }
            else {
                nums[i] = 2;
            }
        }
    }
}
