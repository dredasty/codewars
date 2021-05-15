package org.fresh.hakerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) return new ArrayList<>();
        int aPoints = 0;
        int bPoints = 0;

        for (int i = 0; i < a.size(); i++) {
            int aInt = a.get(i);
            int bInt = b.get(i);
            if (aInt > bInt) {
                aPoints++;
            } else if (aInt < bInt) {
                bPoints++;
            }

        }

        return Arrays.asList(aPoints, bPoints);
    }
}
