package org.fresh.leetcode.longestsubstringwithoutrepeatingcharacters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testLengthOfLongestSubstring() {
        Solution solution = new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(9, solution.lengthOfLongestSubstring("longestsubstringwithoutrepeatingcharacters"));
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }
}
