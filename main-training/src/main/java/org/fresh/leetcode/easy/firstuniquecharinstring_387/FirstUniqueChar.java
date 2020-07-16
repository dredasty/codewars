package org.fresh.leetcode.easy.firstuniquecharinstring_387;

public class FirstUniqueChar {
    public int firstUniqueChar(String s) {
        String str = s;
        if (str == null || str.length() == 0 || str.equals("")) {
            return -1;
        }

        if (str.length() == 1) {
            return 0;
        }

        String first = null;
        while (str.length() > 0) {
            int i = 0;
            String subs = str.substring(i, i + 1);
            if (str.indexOf(subs, i + 1) == -1) {
                if (first == null) {
                    first = subs;
                }
            }
            str = str.replaceAll(subs, "");

        }
        return first == null ? -1 : s.indexOf(first);
    }
}
