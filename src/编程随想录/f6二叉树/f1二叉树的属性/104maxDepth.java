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
class Solution104 {
    // 迭代就用层次遍历
    // 递归无所谓
    public int maxDepth(TreeNode root) {
        return recur(root, 0);
    }

    private int recur(TreeNode cur, int depth) {
        if (cur == null) {
            return depth;
        }

        return Math.max(recur(cur.left, depth + 1),
                recur(cur.right, depth + 1));
    }
}