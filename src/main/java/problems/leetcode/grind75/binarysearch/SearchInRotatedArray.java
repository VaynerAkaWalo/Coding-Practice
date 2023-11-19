package problems.leetcode.grind75.binarysearch;


// [1 2 3 4 5 6 7]
// [4 5 6 7 8 2 3 4]

// [7 8 1 2 3 4 5 6]
public class SearchInRotatedArray {

    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int low, int high, int target) {
        if (high == low) return nums[low] == target ? low : -1;
        if (nums[low] == target) return low;
        if (nums[high] == target) return high;
        if (Math.abs(high - low) == 1) return -1;
        int pivot = low + (high - low) / 2;
        if (nums[pivot] == target) return pivot;

        if (nums[pivot] < target && nums[high] > target) {
            return search(nums, pivot + 1, high, target);
        } else if (nums[pivot] > target && nums[high] < target) {
            return search(nums, low, pivot - 1, target);
        }
        if (nums[pivot] > nums[high]) {
            return search(nums, pivot + 1, high, target);
        }
        return search(nums, low, pivot - 1, target);
    }
}
