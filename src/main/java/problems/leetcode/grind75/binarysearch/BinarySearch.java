package problems.leetcode.grind75.binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int low, int high) {
        if (low == high) return nums[low] == target ? low : -1;
        if (Math.abs(high - low) == 1) {
            if (nums[high] != target && nums[low] != target) return -1;
            return nums[low] == target ? low : high;
        }

        int mid = low + (high - low) / 2;
        if (nums[mid] == target) return mid;

        return target > nums[mid] ? search(nums, target, mid, high) : search(nums, target, low, mid);
    }
}
