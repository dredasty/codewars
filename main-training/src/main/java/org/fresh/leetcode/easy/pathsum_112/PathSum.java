package org.fresh.leetcode.easy.pathsum_112;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }

        return hasSum(root, sum);
    }

    private boolean hasSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        return hasSum(root.left, sum - root.val) || hasSum(root.right, sum - root.val);
    }
}
