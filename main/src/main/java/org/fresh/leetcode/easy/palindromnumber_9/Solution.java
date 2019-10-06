package org.fresh.leetcode.easy.palindromnumber_9;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.valueOf(x).toString();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
