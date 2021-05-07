package org.fresh.leetcode.easy.validparentheses_20;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Solution {

    private final Map<Character, Character> parentheses = new HashMap<>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.equals("");
    }
}
