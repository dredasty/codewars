package org.fresh.leetcode.medium.addtwonumbers_2;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode newHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode current = newHead;

        while (p != null || q != null) {
            if (p != null) {
                sum += p.val;
                p = p.next;
            }

            if (q != null) {
                sum += q.val;
                q = q.next;
            }

            current.next = new ListNode(sum % 10);
            current = current.next;
            sum /= 10;
        }

        if (sum == 1) {
            current.next = new ListNode(1);
        }

        return newHead.next;
    }
}
