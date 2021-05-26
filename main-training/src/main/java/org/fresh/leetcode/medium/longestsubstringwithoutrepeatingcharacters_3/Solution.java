package org.fresh.leetcode.medium.longestsubstringwithoutrepeatingcharacters_3;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i);
            int current = max(substring);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    private int max(String substring) {
        char[] chars = substring.toCharArray();
        int max = 0;
        List<Character> exists = new ArrayList<>();
        for (Character c : chars) {
            if (exists.contains(c)) {
                return max;
            } else {
                max++;
            }
            exists.add(c);
        }
        return max;
    }
}