package org.fresh.leetcode.palindromnumber;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.valueOf(x).toString();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
