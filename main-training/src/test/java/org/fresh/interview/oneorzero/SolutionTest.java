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


/*

=(K22*K22+K22)/2-2

	0	0
2	1	1
	2	0
	3	0
3	4	1
	5	0
	6	0
	7	0
4	8	1
	9	0
	10	0
	11	0
	12	0
5	13	1
	14	0
	15	0
	16	0
	17	0
	18	0
6	19	1
	20	0
	21	0
	22	0
	23	0
	24	0
	25	0
7	26	1
	27	0
	28	0
	29	0
	30	0
	31	0
	32	0
	33	0
8	34	1

 */
