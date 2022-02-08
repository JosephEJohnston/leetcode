package 精刷400.tree;

import javafx.util.Pair;
import 精刷400.tree.Solution100;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution110 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int height(TreeNode node) {
        if (node != null) {
            int left, right;
            if ((left = height(node.left)) == -1
                    || (right = height(node.right)) == -1
                    || Math.abs(left - right) > 1)
                return -1;
            return Math.max(left, right) + 1;
        } else {
            return 0;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }
}