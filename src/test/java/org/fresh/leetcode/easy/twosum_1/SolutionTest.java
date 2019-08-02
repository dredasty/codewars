package org.fresh.leetcode.easy.twosum_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7}, 9));
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
        Assertions.assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
        Assertions.assertArrayEquals(new int[]{1, 5}, solution.twoSum(new int[]{3, 0, 4, 9, 5, Integer.MAX_VALUE}, Integer.MAX_VALUE));
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, -1));
        Assertions.assertArrayEquals(new int[]{2, 3}, solution.twoSum(new int[]{-1, 0, -3, 5, 7}, 2));
        Assertions.assertArrayEquals(new int[]{0, 2}, solution.twoSum(new int[]{-1, 0, -3, 5, 7}, -4));
    }
}
