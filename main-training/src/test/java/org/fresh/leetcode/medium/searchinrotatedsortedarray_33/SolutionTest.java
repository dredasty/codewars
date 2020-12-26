package org.fresh.leetcode.medium.searchinrotatedsortedarray_33;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
class SolutionTest {
    @Test
    void testSearch() {
        Solution solution = new Solution();
        assertThat(solution.search(null, 0)).isEqualTo(-1);
        assertThat(solution.search(new int[]{}, 0)).isEqualTo(-1);
        assertThat(solution.search(new int[]{1, 2}, 1)).isEqualTo(0);
        assertThat(solution.search(new int[]{2, 1}, 1)).isEqualTo(1);
        assertThat(solution.search(new int[]{3, 1}, 3)).isEqualTo(0);
        assertThat(solution.search(new int[]{3, 4, 1}, 1)).isEqualTo(2);
        assertThat(solution.search(new int[]{3, 5, 1}, 4)).isEqualTo(-1);
        assertThat(solution.search(new int[]{1}, 1)).isEqualTo(0);
        assertThat(solution.search(new int[]{0}, 1)).isEqualTo(-1);
        assertThat(solution.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 6)).isEqualTo(5);
        assertThat(solution.search(new int[]{0, 1, 2, 4, 5, 6, 7}, 3)).isEqualTo(-1);
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1)).isEqualTo(5);
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4)).isEqualTo(0);
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)).isEqualTo(-1);
        assertThat(solution.search(new int[]{4, 5, 6, 7, 0, 1, 4}, 3)).isEqualTo(-1);
        assertThat(solution.search(new int[]{40, 56, 61, 72, 12, 13, 22}, 3)).isEqualTo(-1);
        assertThat(solution.search(new int[]{40, 56, 61, 72, 12, 13, 22}, 61)).isEqualTo(2);
        assertThat(solution.search(new int[]{12, 13, 22, 40, 56, 61, 72}, 61)).isEqualTo(5);
    }
}
