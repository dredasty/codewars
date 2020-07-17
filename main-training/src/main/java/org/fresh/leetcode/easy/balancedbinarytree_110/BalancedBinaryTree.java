package org.fresh.leetcode.easy.balancedbinarytree_110;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        return calculateHeight(root, 0) >= 0;
    }

    private int calculateHeight(TreeNode root, int height) {
        if (root == null) {
            return height;
        }
        if (height < 0) {
            return -1;
        }

        int left = height;
        int right = height;

        if (root.left != null) {
            left = calculateHeight(root.left, height + 1);
        }

        if (root.right != null) {
            right = calculateHeight(root.right, height + 1);
        }

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right);
    }
}
