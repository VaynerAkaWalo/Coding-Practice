package problems.leetcode.grind75.heap;

import java.util.Arrays;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        int[] occurrences = new int[26];

        for (char task : tasks) {
            occurrences[task - 'A']++;
        }
        Arrays.sort(occurrences);

        int max = occurrences[25] - 1;
        int time = max * n;

        for (int i = 24; i >= 0; i--) {
            time -= Math.min(occurrences[i], max);
        }

        return time > 0 ? time + tasks.length : tasks.length;
    }
}
