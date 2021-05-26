package org.fresh.leetcode.easy.binarytreepostordertraversal_145;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class PostOrderTraversalSolution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
                return List.of();
        }

        if (root.left == null && root.right == null) {
            return root.val == 0 ? List.of() : List.of(root.val);
        }

        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> nodes = new Stack<>();
        nodes.add(root);

        while(!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            if (current.left != null) {
                nodes.push(current.left);
            }
            if (current.right != null) {
                nodes.push(current.right);
            }
            result.addFirst(current.val);
        }

        return result;
    }
}
