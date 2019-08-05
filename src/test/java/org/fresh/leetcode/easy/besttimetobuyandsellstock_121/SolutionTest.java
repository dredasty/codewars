package org.fresh.leetcode.easy.besttimetobuyandsellstock_121;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class SolutionTest {
    @Test
    public void testMaxProfit() {
        Solution solution = new Solution();
        Assertions.assertThat(solution.maxProfit(null)).isEqualTo(0);
        Assertions.assertThat(solution.maxProfit(new int[]{1})).isEqualTo(0);
        Assertions.assertThat(solution.maxProfit(new int[]{1, 1, 1, 1, 1, 1, 2, 3, 1})).isEqualTo(2);
        Assertions.assertThat(solution.maxProfit(new int[]{7, 3, 9, 1, 4})).isEqualTo(6);
        Assertions.assertThat(solution.maxProfit(new int[]{7, 3, 9, 1, 8})).isEqualTo(7);
        Assertions.assertThat(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        Assertions.assertThat(solution.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
        Assertions.assertThat(solution.maxProfit(new int[]{1, 0, 2})).isEqualTo(2);
        Assertions.assertThat(solution.maxProfit(new int[]{2, 4, 1, 3})).isEqualTo(2);
    }
}
