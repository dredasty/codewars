package org.fresh.leetcode.easy.sortarraybyparity_905;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    @Test
    public void testSolutionTest() {
        Solution solution = new Solution();
        int[] array = new int[]{3, 1, 0, 6, 7, 8, 1, 100, 5000, 6, 5, 4999};
        int[] expected = new int[]{0, 6, 8, 100, 5000, 6, 3, 1, 7, 1, 5, 4999};

        Assertions.assertArrayEquals(solution.sortArrayByParity(array), expected);
    }
}
