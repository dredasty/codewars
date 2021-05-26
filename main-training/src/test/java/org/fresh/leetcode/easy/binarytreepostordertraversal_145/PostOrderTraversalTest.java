package org.fresh.leetcode.easy.binarytreepostordertraversal_145;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class PostOrderTraversalTest {
    @Test
    public void testPostOrderTraversal() {
        PostOrderTraversalSolution solution = new PostOrderTraversalSolution();

        assertThat(solution.postorderTraversal(null))
                .isEqualTo(List.of());

        assertThat(solution.postorderTraversal(new TreeNode()))
                .isEqualTo(List.of());

        assertThat(solution.postorderTraversal(
                new TreeNode(1)))
                .isEqualTo(List.of(1));

        assertThat(solution.postorderTraversal(
                new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))))
                .isEqualTo(List.of(3, 2, 1));

        // [3,2,4,null,null,1]
        assertThat(solution.postorderTraversal(
                new TreeNode(3, new TreeNode(2, null, new TreeNode(5)), new TreeNode(4, new TreeNode(1), null))))
                .isEqualTo(List.of(5, 2, 1, 4, 3));
    }
}
