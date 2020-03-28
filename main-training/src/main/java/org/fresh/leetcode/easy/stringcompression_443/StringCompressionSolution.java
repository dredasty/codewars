package org.fresh.leetcode.easy.stringcompression_443;

public class StringCompressionSolution {
    public int compress(char[] chars) {
        if (chars == null || chars == new char[]{}) {
            return 0;
        }
        if (chars.length == 1) {
            return 1;
        }
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }
}
