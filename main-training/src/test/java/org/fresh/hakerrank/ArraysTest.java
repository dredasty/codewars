package org.fresh.hakerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class ArraysTest {
    @Test
    public void test2DArrays() {
        int[][] sample1 = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] sample2 = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        Solution solution = new Solution();
        Assertions.assertThat(solution.calculateMaxSum(null)).isEqualTo(0);
        Assertions.assertThat(solution.calculateMaxSum(new int[][]{})).isEqualTo(0);
        Assertions.assertThat(solution.calculateMaxSum(sample1)).isEqualTo(7);
        Assertions.assertThat(solution.calculateMaxSum(sample2)).isEqualTo(19);

        int[][] sample3 = new int[][]{
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };
        Assertions.assertThat(solution.calculateMaxSum(sample3)).isEqualTo(-6);
    }
}
