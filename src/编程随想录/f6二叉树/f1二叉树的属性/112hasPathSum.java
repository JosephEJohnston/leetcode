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
class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return recur(root, 0, targetSum);
    }

    private boolean recur(TreeNode cur, int curSum, int targetSum) {
        if (cur == null) {
            return false;
        }

        if (cur.left == null && cur.right == null
                && curSum + cur.val == targetSum) {
            return true;
        }

        curSum += cur.val;

        boolean res;
        res = recur(cur.left, curSum, targetSum);
        res |= recur(cur.right, curSum, targetSum);

        return res;
    }
}