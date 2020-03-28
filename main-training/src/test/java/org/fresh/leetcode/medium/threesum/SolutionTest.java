package org.fresh.leetcode.medium.threesum;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum/
 */
public class SolutionTest {
    @Test
    public void testSolutionthreeSum() {
        Solution solution = new Solution();

        assertThat(solution.threeSum(null)).isEmpty();
        assertThat(solution.threeSum(new int[]{0})).isEmpty();

        int[] ints = {-1, 0, 1, 2, -1, -4};
        assertThat(solution.threeSum(ints)).contains(Arrays.asList(-1, 0, 1));
        assertThat(solution.threeSum(ints)).contains(Arrays.asList(-1, -1, 2));

        assertThat(solution.threeSum(new int[]{0, 0, -1, 0, 0, 1})).contains(Arrays.asList(0, 0, 0));
        assertThat(solution.threeSum(new int[]{0, 0, -1, 0, 0, 1})).contains(Arrays.asList(-1, 0, 1));
    }
}
