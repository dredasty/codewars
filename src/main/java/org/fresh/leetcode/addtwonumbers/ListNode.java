package org.fresh.leetcode.addtwonumbers;

public class ListNode {

    private int val;
    private ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ListNode)) {
            return false;
        }

        ListNode ln = (ListNode) o;
        if (this.next == null && ln.next == null) {
            return this.val == ln.val;
        }

        ListNode head1 = this;
        ListNode head2 = ln;
        while (head1.val == head2.val) {
            if (head1.next == null && head2.next == null) {
                return true;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + val;
        return result;
    }

    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder builder = new StringBuilder("(").append(head.val);
        while (head.next != null) {
            head = head.next;
            builder.append(" -> ").append(head.val);
        }
        return builder.append(")").toString();
    }
}
