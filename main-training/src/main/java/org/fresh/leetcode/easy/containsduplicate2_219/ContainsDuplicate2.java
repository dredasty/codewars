package org.fresh.leetcode.easy.containsduplicate2_219;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = i - map.get(nums[i]);
                if (index <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
