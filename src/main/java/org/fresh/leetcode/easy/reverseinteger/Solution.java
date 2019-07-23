package org.fresh.leetcode.easy.reverseinteger;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class Solution {
    public int reverse(int x) {
        int positive = 1;
        if (x < 0) {
            positive = -1;
            x *= -1;
        }
        String s = new StringBuilder(Integer.toString(x)).reverse().toString();

        try {
            return Integer.parseInt(s) * positive;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
