package org.fresh.leetcode.romantointeger;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testConvertion() {
        Solution solution = new Solution();
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(48, solution.romanToInt("XLVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }
}
