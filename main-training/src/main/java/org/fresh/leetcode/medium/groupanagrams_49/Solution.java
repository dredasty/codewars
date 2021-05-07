package org.fresh.leetcode.medium.groupanagrams_49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return List.of();
        }

        if (strs.length == 1) {
            return List.of(List.of(strs));
        }
        Map<String, List<String>> result = new HashMap<>();

        for (String word : strs) {
            final char[] chars = word.toCharArray();
            Arrays.sort(chars);
            final String key = String.valueOf(chars);
            final List<String> indexes = result.getOrDefault(key, new ArrayList<>());
            indexes.add(word);
            result.put(key, indexes);
        }
        return new ArrayList<>(result.values());
    }
}
