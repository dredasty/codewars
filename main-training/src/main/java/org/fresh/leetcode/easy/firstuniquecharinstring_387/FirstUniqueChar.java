package org.fresh.leetcode.easy.firstuniquecharinstring_387;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueChar {
    public int firstUniqueChar(String s) {
        String str = s;
        if (str == null || str.length() == 0) {
            return -1;
        }

        if (str.length() == 1) {
            return 0;
        }

        while (str.length() > 0) {
            int i = 0;
            String subs = str.substring(i, i + 1);
            if (str.indexOf(subs, i + 1) == -1) {
                return s.indexOf(subs);
            }
            str = str.replaceAll(subs, "");
        }
        return -1;
    }

    public int firstUniqueCharMap(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                if (map.get(s.charAt(i)) != null) {
                    map.remove(s.charAt(i));
                }
            } else {
                map.put(s.charAt(i), i);
                set.add(s.charAt(i));
            }
        }
        return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
    }
}