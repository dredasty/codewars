package org.fresh.leetcode.medium.integertoroman_12;

public class Solution {

    public String intToRoman(int number) {
        String roman = "";
        for (int i = 3; i >= 0; i--) {
            int pow = Double.valueOf(Math.pow(10, i)).intValue();

            if (number >= pow) {
                int reminder = number % pow;
                int count = (number - reminder) / pow;
                number = reminder;

                if (count == 4) {
                    roman += getRoman(pow);
                    roman += getRoman(5 * pow);
                } else if (count == 9) {
                    roman += getRoman(pow);
                    roman += getRoman(10 * pow);
                } else {
                    if (count >= 5) {
                        roman += getRoman(5 * pow);
                        count -= 5;
                    }
                    for (int j = 0; j < count; j++) {
                        roman += getRoman(pow);
                    }
                }
            }
        }
        return roman;
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
