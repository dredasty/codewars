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
        assertThat(solution.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
        assertThat(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})).isEqualTo(new int[]{0,0,9,0,0});
    }
}
