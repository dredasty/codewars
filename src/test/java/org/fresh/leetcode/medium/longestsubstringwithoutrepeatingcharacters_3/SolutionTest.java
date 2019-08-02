package org.fresh.leetcode.medium.longestsubstringwithoutrepeatingcharacters_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testLengthOfLongestSubstring() {
        Solution solution = new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(9, solution.lengthOfLongestSubstring("longestsubstringwithoutrepeatingcharacters_3"));
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }
}
