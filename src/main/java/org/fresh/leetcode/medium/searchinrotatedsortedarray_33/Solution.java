package org.fresh.leetcode.medium.searchinrotatedsortedarray_33;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
// corner case
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) {
            int index = Arrays.binarySearch(nums, target);
            return index < 0 ? -1 : index;
        } else {
            while (end - start > 1) {
                int mid = (start + end) / 2;
                if (nums[start] > nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            if (target == nums[end]) {
                return end;
            }

            int minIndex = end;
            int maxIndex = minIndex;
            int[] beforeMax = Arrays.copyOfRange(nums, 0, maxIndex);
            int[] afterMax = Arrays.copyOfRange(nums, minIndex, nums.length);


            if (beforeMax[0] <= target && target <= beforeMax[beforeMax.length - 1]) {
                int index = Arrays.binarySearch(beforeMax, target);
                return index < 0 ? -1 : index;
            } else if (afterMax[0] <= target && target <= afterMax[afterMax.length - 1]) {
                int index = Arrays.binarySearch(afterMax, target);
                return index < 0 ? -1 : minIndex + index;
            }

            return -1;
        }
    }
}
