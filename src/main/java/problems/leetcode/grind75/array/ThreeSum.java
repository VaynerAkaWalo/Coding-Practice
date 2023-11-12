package problems.leetcode.grind75.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();

        List<List<Integer>> result = new LinkedList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int low = i + 1;
            int high = nums.length - 1;
            while(high > low) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    result.add(List.of(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < nums.length - 1 && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (high > 0 && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;
    }
}
