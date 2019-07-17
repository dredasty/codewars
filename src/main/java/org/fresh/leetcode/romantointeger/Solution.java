package org.fresh.leetcode.romantointeger;

public class Solution {

    public int romanToInt(String romanNumber) {
        int result = 0;
        while (romanNumber.length() > 1) {
            char[] chars = romanNumber.substring(0, 2).toCharArray();
            int one = getInteger(chars[0]);
            int two = getInteger(chars[1]);
            if (one < two) {
                result += (two - one);
                romanNumber = romanNumber.substring(2);
            } else {
                result += one;
                romanNumber = romanNumber.substring(1);
            }
        }
        if (romanNumber.length() > 0) {
            result += getInteger(romanNumber.charAt(0));
        }
        return result;
    }

    private int getInteger(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }
}
