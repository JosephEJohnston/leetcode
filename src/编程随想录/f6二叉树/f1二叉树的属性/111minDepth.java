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
class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return recur(root, 0);
    }

    private int recur(TreeNode cur, int depth) {
        int curDepth = depth + 1;
        if (cur.left == null && cur.right == null) {
            return curDepth;
        }

        if (cur.left == null) {
            return recur(cur.right, curDepth);
        } else if (cur.right == null) {
            return recur(cur.left, curDepth);
        } else {
            return Math.min(recur(cur.left, curDepth),
                    recur(cur.right, curDepth));
        }
    }
}