package org.fresh.leetcode.easy.reverseinteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testReverseInteger() {
        Solution solution = new Solution();
        Assertions.assertEquals(0, solution.reverse(Integer.MAX_VALUE ));
        Assertions.assertEquals(123, solution.reverse(321));
        Assertions.assertEquals(-123, solution.reverse(-321));
        Assertions.assertEquals(0, solution.reverse(0));
        Assertions.assertEquals(1, solution.reverse(10));
        Assertions.assertEquals(1, solution.reverse(+-+-10));
        Assertions.assertEquals(-1, solution.reverse(+-+10));
        Assertions.assertEquals(-1, solution.reverse(-+10));
        Assertions.assertEquals(1, solution.reverse(-+-10));
        Assertions.assertEquals(0, solution.reverse(1239999999));
    }
}
