package org.fresh.leetcode.easy.firstuniquecharinstring_387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharTest {
    @Test
    public void testFirstUniqueCharacter() {
        FirstUniqueChar fuc = new FirstUniqueChar();

        Assertions.assertEquals(-1, fuc.firstUniqueChar(null));
        Assertions.assertEquals(-1, fuc.firstUniqueChar(""));
        Assertions.assertEquals(0, fuc.firstUniqueChar(" "));
        Assertions.assertEquals(0, fuc.firstUniqueChar("love"));
        Assertions.assertEquals(-1, fuc.firstUniqueChar("lovelove"));
        Assertions.assertEquals(0, fuc.firstUniqueChar("leetcode"));
        Assertions.assertEquals(2, fuc.firstUniqueChar("loveleetcode"));
        Assertions.assertEquals(8, fuc.firstUniqueChar("dddccdbba"));
    }
}
