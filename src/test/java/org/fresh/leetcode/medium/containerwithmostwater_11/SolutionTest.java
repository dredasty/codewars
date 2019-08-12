package org.fresh.leetcode.medium.containerwithmostwater_11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class SolutionTest {
    @Test
    public void testMaxArea() {
        Solution solution = new Solution();
        assertThat(solution.maxArea(null)).isEqualTo(0);
        assertThat(solution.maxArea(new int[]{})).isEqualTo(0);
        assertThat(solution.maxArea(new int[]{1})).isEqualTo(0);
        assertThat(solution.maxArea(new int[]{1, 1})).isEqualTo(1);
        assertThat(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    }
}
