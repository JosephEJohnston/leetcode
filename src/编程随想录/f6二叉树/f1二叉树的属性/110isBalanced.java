package 编程随想录.f6二叉树.f1二叉树的属性;

import structure.TreeNode;

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
    // 递归求深度，不满足平衡树就返回 -1
    public boolean isBalanced(TreeNode root) {
        return recur(root, 0) != -1;
    }

    private int recur(TreeNode cur, int height) {
        if (cur == null) {
            return height;
        }

        TreeNode left = cur.left;
        TreeNode right = cur.right;


        if (left == null && right == null) {
            return height + 1;
        }

        int leftHeight = recur(cur.left, height + 1);
        int rightHeight = recur(cur.right, height + 1);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight);
    }
}