package org.fresh.leetcode.easy.balancedbinarytree_110;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTreeTest {
    @Test
    public void testBalancedBinaryTree() {
        BalancedBinaryTree bbt = new BalancedBinaryTree();

        TreeNode balancedTree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode notBalancedTree = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));

        Assertions.assertTrue(bbt.isBalanced(null));
        Assertions.assertTrue(bbt.isBalanced(new TreeNode()));
        Assertions.assertFalse(bbt.isBalanced(notBalancedTree));
        Assertions.assertTrue(bbt.isBalanced(balancedTree));
    }
}
