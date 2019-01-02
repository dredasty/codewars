package org.fresh.leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testAddTwoNumbers() {
        ListNode expected = new ListNode(7).setNext(new ListNode(0).setNext(new ListNode(8)));
        ListNode ln1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode ln2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));

        assertEquals(expected, expected);
        assertEquals(expected, new Solution().addTwoNumbers(ln1, ln2));
    }
}
