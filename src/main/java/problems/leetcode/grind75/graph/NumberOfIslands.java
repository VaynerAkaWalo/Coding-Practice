package problems.leetcode.grind75.graph;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    dfs(i, j, grid);
                }
            }
        }
        return counter;
    }

    private void dfs(int x, int y, char[][] grid) {
        if (x < 0 || x > grid.length - 1 || y < 0 || y > grid[0].length - 1 || grid[x][y] == '0') return;

        grid[x][y] = '0';

        dfs(x + 1, y, grid);
        dfs(x - 1, y, grid);
        dfs(x, y + 1, grid);
        dfs(x, y - 1, grid);
    }
}
