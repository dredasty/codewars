package org.fresh.leetcode.medium.threesum_15;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum/
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums == null || nums.length < 3) {
            return new ArrayList<>(result);
        }

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int one = nums[i];
            if (one > 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                int two = nums[j];
                int three = 0 - one - two;
                if (map.containsKey(three) && map.get(three) > j) {
                    result.add(Arrays.asList(one, two, three));
                }
            }
        }
        return new ArrayList<>(result);
    }
}
