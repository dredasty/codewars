package org.fresh.leetcode.easy.pathsum_112;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }


        hasSum(root, sum);

        return false;
    }

    private boolean hasSum(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        } else {
            hasSum(root.left, sum - root.val);
        }
    }
}
