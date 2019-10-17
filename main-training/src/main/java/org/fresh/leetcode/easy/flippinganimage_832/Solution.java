package org.fresh.leetcode.easy.flippinganimage_832;

//https://leetcode.com/problems/flipping-an-image/
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0) {
            return new int[][]{};
        }
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int[] row = A[i];
            int k = 0;
            for (int j = row.length - 1; j >= 0; j--) {
                result[i][k] = A[i][j] ^ 1;
                k++;
            }
        }
        return result;
    }
}
