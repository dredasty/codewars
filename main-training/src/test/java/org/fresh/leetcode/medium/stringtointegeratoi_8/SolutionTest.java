package org.fresh.leetcode.medium.stringtointegeratoi_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testStringToInteger() {
        Solution solution = new Solution();
        Assertions.assertEquals(2147483647, solution.myAtoi("20000000000000000000"));
        Assertions.assertEquals(0, solution.myAtoi("-+1"));
        Assertions.assertEquals(1, solution.myAtoi("+1"));
        Assertions.assertEquals(0, solution.myAtoi("+-1"));
        Assertions.assertEquals(0, solution.myAtoi("-"));
        Assertions.assertEquals(0, solution.myAtoi(""));
        Assertions.assertEquals(0, solution.myAtoi("      "));
        Assertions.assertEquals(0, solution.myAtoi(null));
        Assertions.assertEquals(42, solution.myAtoi("42"));
        Assertions.assertEquals(-42, solution.myAtoi("-42"));
        Assertions.assertEquals(-42, solution.myAtoi("   -42"));
        Assertions.assertEquals(4193, solution.myAtoi("4193 with words"));
        Assertions.assertEquals(0, solution.myAtoi("words and 987"));
        Assertions.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
        Assertions.assertEquals(2147483647, solution.myAtoi("91283472332"));
    }
}
