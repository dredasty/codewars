package org.fresh.leetcode.medium.mergeintervals_56;

/**
 * https://leetcode.com/problems/merge-intervals/
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

    @Test
    public void testMergeIntervals() {
        MergeIntervals mi = new MergeIntervals();

        Assertions.assertArrayEquals(mi.merge(null), new int[][]{});
        Assertions.assertArrayEquals(mi.merge(new int[][]{}), new int[][]{});
        Assertions.assertArrayEquals(mi.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}), new int[][]{{1, 6}, {8, 10}, {15, 18}});
        Assertions.assertArrayEquals(mi.merge(new int[][]{{1, 4}, {4, 5}}), new int[][]{{1, 5}});
        Assertions.assertArrayEquals(mi.merge(new int[][]{{1, 4}, {5, 6}}), new int[][]{{1, 4}, {5, 6}});
        Assertions.assertArrayEquals(mi.merge(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}), new int[][]{{1, 10}});
    }
}
