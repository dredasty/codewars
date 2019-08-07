package org.fresh.leetcode.medium.findminimuminrotatedsortedarray_153;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] < nums[end]) {
            return nums[start];
        }

        while (end - start > 1) {
            int mid = (start + end) / 2;
            if (nums[start] > nums[mid]) {
                end = mid;
            } else {
                start = mid;
            }

        }
        return nums[end];
    }
}
