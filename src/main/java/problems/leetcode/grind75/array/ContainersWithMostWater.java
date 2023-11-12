package problems.leetcode.grind75.array;

public class ContainersWithMostWater {

    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;

        while (low < high) {
            int lowerSide = Math.min(height[low], height[high]);
            max = Math.max(max, (high - low) * lowerSide);
            if (height[low] < height[high]) {
                low++;
            }
            else {
                high--;
            }
        }
        return max;
    }
}
