package org.fresh.leetcode.easy.twosum_1;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            table.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int two = target - nums[i];
            final Integer second = table.get(two);
            if (second != null) {
                if (second == i) {
                    continue;
                }
                return new int[]{i, second};
            }
        }
        return new int[]{0, 0};
    }
}