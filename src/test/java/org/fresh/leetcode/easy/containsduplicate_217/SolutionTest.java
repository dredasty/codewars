package org.fresh.leetcode.easy.containsduplicate_217;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SolutionTest {

    @Test
    public void testContainsDuplicate() {
        Solution solution = new Solution();
        Assertions.assertThat(solution.containsDuplicate(null)).isEqualTo(false);
        Assertions.assertThat(solution.containsDuplicate(new int[]{0})).isEqualTo(false);
        Assertions.assertThat(solution.containsDuplicate(new int[]{0, 1})).isEqualTo(false);
        Assertions.assertThat(solution.containsDuplicate(new int[]{1,2,3,4})).isEqualTo(false);
        Assertions.assertThat(solution.containsDuplicate(new int[]{1,2,3,1})).isEqualTo(true);
        Assertions.assertThat(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})).isEqualTo(true);
    }

    @Test
    public void testTimingContainsDuplicate() {
        int[] ints = new Random().ints(1000000, 0, Integer.MAX_VALUE).toArray();
        Solution solution = new Solution();
        Assertions.assertThat(solution.containsDuplicate(ints)).isEqualTo(false);
    }
}
