package org.fresh.leetcode.medium.productofarrayexceptself_238;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
@Disabled
public class SolutionTest {
    @Test
    public void testProductOfArrayExceptSelf() {
        Solution solution = new Solution();
        assertThat(solution.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
    }
}
