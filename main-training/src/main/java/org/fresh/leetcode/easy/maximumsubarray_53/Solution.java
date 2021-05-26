package org.fresh.leetcode.easy.maximumsubarray_53;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int max = nums[0];
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i] + current, nums[i]);
            max = Math.max(current, max);
        }

        return max;
    }
}
