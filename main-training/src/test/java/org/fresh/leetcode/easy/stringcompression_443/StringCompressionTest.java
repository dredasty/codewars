package org.fresh.leetcode.easy.stringcompression_443;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    @Test
    public void testStringCompression() {
        StringCompressionSolution scs = new StringCompressionSolution();
        Assertions.assertThat(scs.compress(null)).isEqualTo(0);
        Assertions.assertThat(scs.compress(new char[]{})).isEqualTo(0);
        Assertions.assertThat(scs.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
        Assertions.assertThat(scs.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isEqualTo(4);
        Assertions.assertThat(scs.compress(new char[]{'a'})).isEqualTo(1);
    }
}
