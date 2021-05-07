package org.fresh.leetcode.easy.validparentheses;

import org.assertj.core.api.Assertions;
import org.fresh.leetcode.easy.validparentheses_20.Solution;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesesTest {
    @Test
    public void testValidParentheses() {
        Solution solution = new Solution();
        Assertions.assertThat(solution.isValid(null)).as("null").isFalse();
        Assertions.assertThat(solution.isValid("")).as("empty").isFalse();
        Assertions.assertThat(solution.isValid("(")).as("(").isFalse();
        Assertions.assertThat(solution.isValid("4")).as("4").isFalse();
        Assertions.assertThat(solution.isValid("([)]")).as("([)]").isFalse();
        Assertions.assertThat(solution.isValid("(]")).as("(]").isFalse();
        Assertions.assertThat(solution.isValid("](){}")).as("](){}").isFalse();
        Assertions.assertThat(solution.isValid("][(){}")).as("][(){}").isFalse();


        Assertions.assertThat(solution.isValid("()")).as("()").isTrue();
        Assertions.assertThat(solution.isValid("[]")).as("[]").isTrue();
        Assertions.assertThat(solution.isValid("{}")).as("{}").isTrue();
        Assertions.assertThat(solution.isValid("()[]{}")).as("()[]{}").isTrue();
        Assertions.assertThat(solution.isValid("{[]}")).as("{[]}").isTrue();
        Assertions.assertThat(solution.isValid("({((([()])))})")).as("({((([()])))})").isTrue();
        Assertions.assertThat(solution.isValid("((()(())))")).as("((()(())))").isTrue();
    }
}
