package org.fresh.leetcode.medium.addtwonumbers_2;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    int val;
    ListNode next;

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
        List<String> list = getListValues();
        return "(" + String.join(" -> ", list) + ")";
    }

    private List<String> getListValues() {
        ListNode head = this;
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(head.val));
        while (head.next != null) {
            head = head.next;
            list.add(String.valueOf(head.val));
        }
        return list;
    }
}
