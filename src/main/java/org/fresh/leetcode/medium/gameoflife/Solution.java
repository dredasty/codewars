package org.fresh.leetcode.medium.gameoflife;

/**
 * https://leetcode.com/problems/game-of-life/
 * <p>
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 */
class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] result = gameOfLifeTest(board);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = result[row][col];
            }
        }

    }

    public int[][] gameOfLifeTest(int[][] input) {
        int[][] result = new int[input.length][input[0].length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                int sum = calculateSum(input, i, j);
                if (sum == 3) {
                    result[i][j] = 1;
                } else if (sum == 2) {
                    result[i][j] = input[i][j];
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    private int calculateSum(int[][] input, int row, int col) {
        int sum = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                try {
                    sum += input[row + i][col + j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    // avoid edge cells
                }
            }
        }
        return sum;
    }
}