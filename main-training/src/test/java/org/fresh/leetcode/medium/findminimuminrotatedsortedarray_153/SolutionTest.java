package org.fresh.leetcode.medium.findminimuminrotatedsortedarray_153;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class SolutionTest {
    @Test
    public void testFindMinimum() {
        Solution solution = new Solution();
        assertThat(solution.findMin(null)).isEqualTo(0);
        assertThat(solution.findMin(new int[]{})).isEqualTo(0);
        assertThat(solution.findMin(new int[]{3, 4, 5, 1, 2})).isEqualTo(1);
        assertThat(solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2})).isEqualTo(0);
    }
}
