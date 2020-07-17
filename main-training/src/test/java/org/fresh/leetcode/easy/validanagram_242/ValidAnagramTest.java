package org.fresh.leetcode.easy.validanagram_242;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagramTest {
    @Test
    public void testValidAnagram() {
        ValidAnagram va = new ValidAnagram();

        Assertions.assertFalse(va.isAnagram(null, null));
        Assertions.assertFalse(va.isAnagram(null, "null"));
        Assertions.assertFalse(va.isAnagram("null", null));
        Assertions.assertFalse(va.isAnagram("car", "rat"));
        Assertions.assertTrue(va.isAnagram("", ""));
        Assertions.assertTrue(va.isAnagram("anagram", "nagaram"));
    }
}
