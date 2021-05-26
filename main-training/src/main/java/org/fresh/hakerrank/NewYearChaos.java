package org.fresh.hakerrank;

import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        minimumBribes(List.of(2, 1, 5, 3, 4));
        minimumBribes(List.of(2, 5, 1, 3, 4));
    }

    public static void minimumBribes(List<Integer> q) {
        int swaps = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++)
                if (q.get(j) > q.get(i)) swaps++;
        }
        System.out.println(swaps);
    }
}
