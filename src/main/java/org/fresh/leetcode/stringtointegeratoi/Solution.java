package org.fresh.leetcode.stringtointegeratoi;

public class Solution {
    public int myAtoi(String str) {
        boolean isNegative = false;

        if (str == null) {
            return 0;
        }

        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(0) == 45) {
            isNegative = true;
            str = str.substring(1);
        } else if (str.charAt(0) == 43) {
            str = str.substring(1);
        }

        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) != 45 && isNotNumber(str.charAt(0))) {
            return 0;
        }

        int i;
        for (i = 0; i < str.length(); i++) {
            if (isNotNumber(str.charAt(i))) {
                break;
            }
        }

        if (i == 0) {
            return 0;
        }

        try {
            return Integer.valueOf((isNegative ? "-" : "") + str.substring(0, i));
        } catch (NumberFormatException nfe) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

    private boolean isNotNumber(char c) {
        return c < 48 || c >= 58;
    }
}
