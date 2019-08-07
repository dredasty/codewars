package org.fresh.leetcode.medium.maximumproductsubarray_152;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class SolutionTest {
    @Test
    public void testMaxProduct() {
        Solution solution = new Solution();
        assertThat(solution.maxProduct(null)).isEqualTo(0);
        assertThat(solution.maxProduct(new int[]{})).isEqualTo(0);
        assertThat(solution.maxProduct(new int[]{0})).isEqualTo(0);
        assertThat(solution.maxProduct(new int[]{-2, 0, -1})).isEqualTo(0);
        assertThat(solution.maxProduct(new int[]{-2, -1, 0})).isEqualTo(2);
        assertThat(solution.maxProduct(new int[]{Integer.MAX_VALUE, 1})).isEqualTo(Integer.MAX_VALUE);
        assertThat(solution.maxProduct(new int[]{Integer.MAX_VALUE, 10})).isEqualTo(Integer.MAX_VALUE);
        assertThat(solution.maxProduct(new int[]{2, 4, -1, 3})).isEqualTo(8);
        assertThat(solution.maxProduct(new int[]{-2, 3, 2, -4})).isEqualTo(48);
        assertThat(solution.maxProduct(new int[]{-2, 3, -4})).isEqualTo(24);
        assertThat(solution.maxProduct(new int[]{-2, 3, -4, 2, 5, -5})).isEqualTo(600);
    }
}
