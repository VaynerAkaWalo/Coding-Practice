package problems.leetcode.grind75.array;

import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new LinkedList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        while(i < intervals.length && intervals[i][0] <= newInterval[1]) {
            if(intervals[i][0] < newInterval[0]) {
                newInterval[0] = intervals[i][0];
            }
            if(intervals[i][1] > newInterval[1]) {
                newInterval[1] = intervals[i][1];
            }
            i++;
        }

        result.add(newInterval);
        while(i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
