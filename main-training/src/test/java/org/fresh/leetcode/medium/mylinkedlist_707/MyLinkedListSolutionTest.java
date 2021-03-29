package org.fresh.leetcode.medium.mylinkedlist_707;

import org.assertj.core.api.Assertions;
import org.fresh.leetcode.medium.mylinkedlist707.MyLinkedList;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/design-linked-list/
 */
public class MyLinkedListSolutionTest {
    @Test
    public void testMyLinkedList() {

        MyLinkedList myLinkedList = new MyLinkedList();
        Assertions.assertThat(myLinkedList.get(0)).isEqualTo(-1);
        Assertions.assertThat(myLinkedList.get(100)).isEqualTo(-1);

        myLinkedList.addAtHead(1);

        Assertions.assertThat(myLinkedList.get(100)).isEqualTo(-1);

        myLinkedList.addAtTail(3); // linked list becomes 1->3
        myLinkedList.addAtIndex(1, 2);   // linked list becomes 1->2->3

        myLinkedList.addAtIndex(100, 2); // invalid index. not inserted
        Assertions.assertThat(myLinkedList.get(0)).isEqualTo(1);
        Assertions.assertThat(myLinkedList.get(1)).isEqualTo(2);
        Assertions.assertThat(myLinkedList.get(2)).isEqualTo(3);
        Assertions.assertThat(myLinkedList.get(100)).isEqualTo(-1);

        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3

        Assertions.assertThat(myLinkedList.get(0)).isEqualTo(1);
        Assertions.assertThat(myLinkedList.get(1)).isEqualTo(3);
    }

    @Test
    public void testMyLinkedListAdding() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(3);
        Assertions.assertThat(myLinkedList.get(0)).isEqualTo(3);
        myLinkedList.addAtHead(2);
        Assertions.assertThat(myLinkedList.get(0)).isEqualTo(2);
        myLinkedList.addAtHead(1);

        Assertions.assertThat(myLinkedList.get(0)).isEqualTo(1);
        Assertions.assertThat(myLinkedList.get(1)).isEqualTo(2);
        Assertions.assertThat(myLinkedList.get(2)).isEqualTo(3);
    }
}
