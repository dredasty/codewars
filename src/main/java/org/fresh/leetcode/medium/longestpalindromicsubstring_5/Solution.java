package org.fresh.leetcode.medium.longestpalindromicsubstring_5;

public class Solution {
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length() - result.length(); i++) {
            for (int j = s.length(); j > i + result.length(); j--) {
                String temp = s.substring(i, j);
                if (temp.length() > result.length() && isPalindrome(temp)) {
                    result = temp;
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String temp) {
        int i = 0;
        int length = temp.length();
        while (i < length) {
            if (temp.charAt(i) == temp.charAt(length - i - 1)) {
                i++;
                if (length - i - 2 == 0) {
                    break;
                }
            } else {
                return false;
            }

        }
        return true;
    }
}
