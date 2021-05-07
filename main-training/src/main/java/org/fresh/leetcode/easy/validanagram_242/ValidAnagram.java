package org.fresh.leetcode.easy.validanagram_242;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            String subs = s.substring(i, i + 1);
            if (!t.contains(subs)) {
                return false;
            }
            t = t.replaceFirst(subs, "");
        }
        return true;
    }
}
