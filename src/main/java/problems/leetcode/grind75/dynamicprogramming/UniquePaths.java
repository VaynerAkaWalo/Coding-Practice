package problems.leetcode.grind75.dynamicprogramming;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] uniquePaths = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    uniquePaths[i][j] = 1;
                }
                else {
                    uniquePaths[i][j] = uniquePaths[i - 1][j] + uniquePaths[i][j - 1];
                }
            }
        }

        return uniquePaths[m - 1][n - 1];
    }
}
