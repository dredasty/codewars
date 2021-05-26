package org.fresh.hakerrank.hard;

import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        final List<List<Integer>> list = List.of(
                List.of(9, 10, 9),
                List.of(1, 5, 3),
                List.of(4, 8, 7),
                List.of(6, 9, 2)
        );
        final long l = arrayManipulation(10, list);
        System.out.println(l);
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 1];

        for (int i = 0; i < n; i++) arr[i] = 0;

        for (List<Integer> query : queries) {
            int lower = query.get(0);
            int upper = query.get(1);
            long sum = query.get(2);
            arr[lower - 1] += sum;
            if (upper < n) {
                arr[upper] -= sum;
            }
        }

        long max = 0;
        long temp = 0;

        for (int i = 0; i < n; i++) {
            temp += arr[i];
            max = Math.max(temp, max);
        }

        return max;
    }
}
