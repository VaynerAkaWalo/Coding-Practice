package problems.leetcode.grind75.recursion;

import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();

        helper(result, new ArrayList<>(), nums);

        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new LinkedList<>(list));
        }

        for (int num : nums) {
            if (list.contains(num)) continue;

            list.add(num);

            helper(result, list, nums);

            list.remove(list.size() - 1);
        }
    }



}
