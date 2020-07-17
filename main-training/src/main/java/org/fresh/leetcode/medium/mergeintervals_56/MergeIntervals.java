package org.fresh.leetcode.medium.mergeintervals_56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] interval : intervals) {
            if (list.isEmpty() || list.getLast()[1] < interval[0]) {
                list.add(interval);
            } else {
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
