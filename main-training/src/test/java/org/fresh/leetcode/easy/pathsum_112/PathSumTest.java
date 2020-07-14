package org.fresh.leetcode.easy.pathsum_112;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {
    @Test
    public void testPathSum() {
        PathSum ps = new PathSum();

        Assertions.assertFalse(ps.hasPathSum(null, 0));
        Assertions.assertFalse(ps.hasPathSum(new TreeNode(1), 0));
        Assertions.assertTrue(ps.hasPathSum(new TreeNode(), 0));;
        Assertions.assertTrue(ps.hasPathSum(new TreeNode(0), 0));
        Assertions.assertTrue(ps.hasPathSum(new TreeNode(1), 1));

        TreeNode treeNode = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7), new TreeNode(2)), null),

                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        Assertions.assertTrue(ps.hasPathSum(treeNode, 22));
        Assertions.assertTrue(ps.hasPathSum(treeNode, 26));
        Assertions.assertTrue(ps.hasPathSum(treeNode, 18));
    }
}
