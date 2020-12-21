package org.fresh.leetcode.medium.binarytreeorderleveltraversal_102;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BinaryTreeLevelOrderTraversalTest {

    @Disabled
    @Test
    public void testBinaryTreeLevelOrderTraversal() {
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();

        Assertions.assertEquals(List.of(List.of()), traversal.levelOrder(null));
        Assertions.assertEquals(List.of(List.of()), traversal.levelOrder(new TreeNode()));
        Assertions.assertEquals(List.of(List.of(1)), traversal.levelOrder(new TreeNode(1)));

        TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Assertions.assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), traversal.levelOrder(node));
    }
}
