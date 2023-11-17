package problems.leetcode.grind75.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

    int[][] array;
    public int[][] kClosest(int[][] points, int k) {
        array = points;
        Queue<Integer> queue = new PriorityQueue<>((x, y) -> (int) (distance(x) - distance(y)));
        for (int i = 0; i < points.length; i++) {
            queue.add(i);
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int point = queue.poll();
            result[i][0] = array[point][0];
            result[i][1] = array[point][1];
        }
        return result;
    }

    private double distance(int point) {
        return Math.sqrt(Math.pow(array[point][0], 2) + Math.pow(array[point][1], 2)) * 100;
    }
}
