package org.fresh.leetcode.medium.maximumproductsubarray_152;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentMaxCopy = currentMax;
            currentMax = Math.max(Math.max(currentMax * nums[i], nums[i]), currentMin * nums[i]);
            currentMin = Math.min(Math.min(currentMin * nums[i], nums[i]), currentMaxCopy * nums[i]);
            max = Math.max(currentMax, max);
        }
        return max;
    }
}
