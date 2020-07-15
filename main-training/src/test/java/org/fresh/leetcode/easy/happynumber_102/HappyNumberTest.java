package org.fresh.leetcode.easy.happynumber_102;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumberTest {
    @Test
    public void testHappyNumber() {
        HappyNumber hn = new HappyNumber();

        Assertions.assertFalse(hn.isHappy(0));
        Assertions.assertFalse(hn.isHappy(-1));
        Assertions.assertTrue(hn.isHappy(1));
        Assertions.assertTrue(hn.isHappy(19));
        Assertions.assertFalse(hn.isHappy(54));
        Assertions.assertTrue(hn.isHappy(100));

    }
}
