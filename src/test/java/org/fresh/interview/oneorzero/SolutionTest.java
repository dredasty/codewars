package org.fresh.interview.oneorzero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals(1, Solution.findByIndex(1));
        assertEquals(0, Solution.findByIndex(2));
        assertEquals(1, Solution.findByIndex(6));
        assertEquals(1, Solution.findByIndex(10));
        assertEquals(0, Solution.findByIndex(11));
    }
}
