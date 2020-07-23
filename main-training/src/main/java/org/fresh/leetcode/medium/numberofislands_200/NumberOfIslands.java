package org.fresh.leetcode.medium.numberofislands_200;

/**
 * https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIslands {
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int number = 0;
        this.rows = grid.length;
        this.cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    number++;
                }
            }
        }


        return number;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= this.rows || j >= this.cols || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
