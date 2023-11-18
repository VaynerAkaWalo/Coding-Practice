package problems.leetcode.grind75.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        List<int[]> result = new LinkedList<>();
        int low = 0;
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

        while (low < intervals.length) {
            int[] interval = {intervals[low][0], intervals[low][1]};

            int high = low + 1;
            while(high < intervals.length && interval[1] >= intervals[high][0]) {
                interval[1] = Math.max(interval[1], intervals[high][1]);
                high++;
            }

            result.add(interval);
            low = high;
        }

        int[][] resultArray = new int[result.size()][2];
        int index = 0;
        for (int[] ints : result) {
            resultArray[index++] = ints;
        }

        return resultArray;
    }
}
