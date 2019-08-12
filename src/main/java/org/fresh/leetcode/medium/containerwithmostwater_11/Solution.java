package org.fresh.leetcode.medium.containerwithmostwater_11;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while (r > l) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
