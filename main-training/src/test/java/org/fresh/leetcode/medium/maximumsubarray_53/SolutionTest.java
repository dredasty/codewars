package org.fresh.leetcode.medium.maximumsubarray_53;

import org.fresh.leetcode.easy.maximumsubarray_53.Solution;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class SolutionTest {
    @Test
    public void testMaximumSubarray() {
        Solution solution = new Solution();
        assertThat(solution.maxSubArray(null)).isEqualTo(0);
        assertThat(solution.maxSubArray(new int[]{0, 1})).isEqualTo(1);
        assertThat(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    }
}
