package org.fresh.leetcode.medium.integertoroman_12;

public class Solution {

    public String intToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            int pow = Double.valueOf(Math.pow(10, i)).intValue();

            if (number >= pow) {
                int reminder = number % pow;
                int count = (number - reminder) / pow;
                number = reminder;

                if (count == 4) {
                    roman.append(getRoman(pow));
                    roman.append(getRoman(5 * pow));
                } else if (count == 9) {
                    roman.append(getRoman(pow));
                    roman.append(getRoman(10 * pow));
                } else {
                    if (count >= 5) {
                        roman.append(getRoman(5 * pow));
                        count -= 5;
                    }
                    for (int j = 0; j < count; j++) {
                        roman.append(getRoman(pow));
                    }
                }
            }
        }
        return roman.toString();
    }

    private char getRoman(Number number) {
        switch (number.intValue()) {
            case 1:
                return 'I';
            case 5:
                return 'V';
            case 10:
                return 'X';
            case 50:
                return 'L';
            case 100:
                return 'C';
            case 500:
                return 'D';
            case 1000:
                return 'M';
            default:
                return ' ';
        }
    }
}
