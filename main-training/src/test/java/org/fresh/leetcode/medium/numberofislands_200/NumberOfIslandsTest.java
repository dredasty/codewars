package org.fresh.leetcode.medium.numberofislands_200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIslandsTest {
    @Test
    public void testNumberOfIslands() {
        NumberOfIslands noi = new NumberOfIslands();

        Assertions.assertEquals(0, noi.numIslands(null));
        Assertions.assertEquals(0, noi.numIslands(new char[][]{}));

        Assertions.assertEquals(0, noi.numIslands(new char[][]{{'0'}}));
        Assertions.assertEquals(2, noi.numIslands(new char[][]{{'1', '0', '1'}}));
        Assertions.assertEquals(1, noi.numIslands(new char[][]{{'1'}}));

        final char[][] grid = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}};
        Assertions.assertEquals(1, noi.numIslands(grid));

        final char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        Assertions.assertEquals(1, noi.numIslands(grid1));

        final char[][] grid3 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        Assertions.assertEquals(3, noi.numIslands(grid3));
    }
}
