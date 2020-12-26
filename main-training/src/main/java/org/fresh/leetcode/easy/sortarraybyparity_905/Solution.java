package org.fresh.leetcode.easy.sortarraybyparity_905;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even.add(A[i]);
            } else {
                odd.add(A[i]);
            }
        }

        even.addAll(odd);
        return even.stream().mapToInt(i -> i).toArray();
    }
}
