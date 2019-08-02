package org.fresh.leetcode.medium.productofarrayexceptself_238;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class SolutionTest {
    @Test
    public void testProductOfArrayExceptSelf() {
        Solution solution = new Solution();
        assertThat(solution.productExceptSelf(null)).isEqualTo(new int[]{});
        assertThat(solution.productExceptSelf(new int[]{0})).isEqualTo(new int[]{});
        assertThat(solution.productExceptSelf(new int[]{0, 1})).isEqualTo(new int[]{1, 0});
        assertThat(solution.productExceptSelf(new int[]{0, 1, 2, 3})).isEqualTo(new int[]{6, 0, 0, 0});
        assertThat(solution.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
        assertThat(solution.productExceptSelf(new int[]{Integer.MAX_VALUE, 0, 1, 2})).isEqualTo(new int[]{0, Integer.MAX_VALUE, 0, 0});
    }
}
