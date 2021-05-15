package org.fresh.hakerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().mapToLong(Long::longValue).sum();
    }
}
