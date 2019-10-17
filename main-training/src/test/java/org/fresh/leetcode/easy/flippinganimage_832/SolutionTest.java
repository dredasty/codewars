package org.fresh.leetcode.easy.flippinganimage_832;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class SolutionTest {
    @Test
    public void testProductOfArrayExceptSelf() {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(solution.flipAndInvertImage(null), new int[][]{});
        Assertions.assertArrayEquals(solution.flipAndInvertImage(new int[][]{}), new int[][]{});

        int[][] image1 = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] expected1 = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        Assertions.assertArrayEquals(expected1, solution.flipAndInvertImage(image1));

        int[][] image2 = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] expected2 = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        Assertions.assertArrayEquals(expected2, solution.flipAndInvertImage(image2));
    }
}
