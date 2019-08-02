package org.fresh.leetcode.easy.containsduplicate_217;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int number : nums) {
            if (set.contains(number)) {
                return true;
            }
            set.add(number);
        }
        return false;
    }
}
