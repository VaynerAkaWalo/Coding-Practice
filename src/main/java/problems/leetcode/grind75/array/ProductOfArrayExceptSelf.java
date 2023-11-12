package problems.leetcode.grind75.array;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] postfixProduct = new int[nums.length];
        int[] result = new int[nums.length];

        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }

        postfixProduct[nums.length - 1] = 1;
        result[nums.length - 1] = prefixProduct[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            postfixProduct[i] = postfixProduct[i + 1] * nums[i + 1];
            result[i] = prefixProduct[i] * postfixProduct[i];
        }

        return result;
    }
}
