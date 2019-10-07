package org.fresh.interview.oneorzero;

public class Solution {
    public static int findByIndex(int i) {
        double x = (-1 + Math.sqrt(1 + 4 * 2 * i)) / 2;
        if (x == (int) x) {
            return 1;
        }
        return 0;
    }
}
