package org.fresh.leetcode.medium.groupanagrams_49;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        Solution solution = new Solution();
        Assertions.assertThat(solution.groupAnagrams(null)).isEqualTo(List.of());
        Assertions.assertThat(solution.groupAnagrams(new String[]{})).isEqualTo(List.of());
        Assertions.assertThat(solution.groupAnagrams(new String[]{""})).isEqualTo(List.of(List.of("")));
        Assertions.assertThat(solution.groupAnagrams(new String[]{"a"})).isEqualTo(List.of(List.of("a")));

        Assertions.assertThat(solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}))
                .containsExactlyInAnyOrderElementsOf(List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat")));
    }
}
