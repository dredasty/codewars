package org.fresh.leetcode.palindromenumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.fresh.leetcode.palindromnumber.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(122));
        assertFalse(solution.isPalindrome(-123));
        assertFalse(solution.isPalindrome(-1));
        assertTrue(solution.isPalindrome(0));
        assertFalse(solution.isPalindrome(21));
        assertFalse(solution.isPalindrome(2147483647));
        assertTrue(solution.isPalindrome(123321));
        assertTrue(solution.isPalindrome(1234321));
    }
}
