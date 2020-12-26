package org.fresh.leetcode.medium.wordladder_127;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://leetcode.com/problems/word-ladder/
 */
public class WordLadderTest {
    @Test
    public void testWordLadder() {
        WordLadderSolution solution = new WordLadderSolution();
        Assertions.assertEquals(solution.ladderLength(null, null, null), 0);
        Assertions.assertEquals(solution.ladderLength("dog", "dig", null), 0);
        Assertions.assertEquals(solution.ladderLength("dog", "dig", Collections.emptyList()), 0);
        Assertions.assertEquals(solution.ladderLength("", "", Collections.singletonList("")), 0);
        Assertions.assertEquals(solution.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")), 5);
        Assertions.assertEquals(solution.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")), 0);
    }
}