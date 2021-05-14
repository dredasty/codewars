package org.fresh.hakerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class Solution {

    public int calculateMaxSum(int[][] array) {
        if (array == null || array.length == 0 || array.length != array[0].length) {
            return 0;
        }

        List<Integer> max = new ArrayList<>();
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                max.add(calculateHourglass(array, i, j));
            }
        }

        return max.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

    private int calculateHourglass(int[][] array, int i, int j) {
        return array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1]
                + array[i][j]
                + array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1];
    }
}
