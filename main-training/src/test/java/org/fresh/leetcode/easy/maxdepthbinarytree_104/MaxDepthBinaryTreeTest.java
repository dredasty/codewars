package org.fresh.leetcode.easy.maxdepthbinarytree_104;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxDepthBinaryTreeTest {
    @Test
    public void testMaxDepthBinaryTree() {
        MaxDepthBinaryTree bt = new MaxDepthBinaryTree();

        Assertions.assertEquals(bt.maxDepth(null), 0);
        Assertions.assertEquals(bt.maxDepth(new TreeNode()), 1);
        Assertions.assertEquals(bt.maxDepth(new TreeNode(1)), 1);
        Assertions.assertEquals(bt.maxDepth(new TreeNode(0)), 1);

        TreeNode tree3 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Assertions.assertEquals(bt.maxDepth(tree3), 3);

        TreeNode tree4 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7, null, new TreeNode(1))));
        Assertions.assertEquals(bt.maxDepth(tree4), 4);
    }
}