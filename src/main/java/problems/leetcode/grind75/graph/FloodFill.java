package problems.leetcode.grind75.graph;

import java.nio.charset.CoderResult;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        bfs(image, new Coords(sr, sc), color);

        return image;
    }

    private void bfs(int[][] image, Coords position, int color) {
        if (image[position.x][position.y] == color) return;
        int currentColor = image[position.x][position.y];
        Queue<Coords> queue = new LinkedList<>();
        queue.add(position);

        while (!queue.isEmpty()) {
            position = queue.remove();
            if (image[position.x][position.y] == currentColor) {
                queue.addAll(getNeighbours(position, image, currentColor));
                image[position.x][position.y] = color;
            }
        }
    }

    private List<Coords> getNeighbours(Coords position, int[][] image, int currentColor) {
        List<Coords> result = new LinkedList<>();
        if (position.x + 1 < image.length && image[position.x + 1][position.y] == currentColor) {
            result.add(new Coords(position.x + 1, position.y));
        }
        if (position.y + 1 < image[0].length && image[position.x][position.y + 1] == currentColor) {
            result.add(new Coords(position.x, position.y + 1));
        }
        if (position.x - 1 > - 1 && image[position.x - 1][position.y] == currentColor) {
            result.add(new Coords(position.x - 1, position.y));
        }
        if (position.y - 1 > - 1 && image[position.x][position.y - 1] == currentColor) {
            result.add(new Coords(position.x, position.y - 1));
        }
        return result;
    }

    record Coords(int x, int y) {}
}
