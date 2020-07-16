package org.fresh.leetcode.easy.containsduplicate2_219;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate2Test {
    @Test
    public void testContainsDuplicate2() {
        ContainsDuplicate2 cd = new ContainsDuplicate2();

        Assertions.assertFalse(cd.containsNearbyDuplicate(null, 0));
        Assertions.assertFalse(cd.containsNearbyDuplicate(new int[0], 0));
        Assertions.assertFalse(cd.containsNearbyDuplicate(new int[]{}, 0));
        Assertions.assertTrue(cd.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        Assertions.assertTrue(cd.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 4));
        Assertions.assertTrue(cd.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        Assertions.assertFalse(cd.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        Assertions.assertTrue(cd.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 3));
        Assertions.assertTrue(cd.containsNearbyDuplicate(new int[]{99, 99}, 2));
    }
}
