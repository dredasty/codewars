package org.fresh.leetcode.easy.palindromenumber_9;

import org.fresh.leetcode.easy.palindromnumber_9.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
