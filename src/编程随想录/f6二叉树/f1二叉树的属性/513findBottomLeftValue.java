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
class Solution513 {
    // 不知道有没有特殊解法，时间复杂度会低一些的
    // 好像没有

    static class Result {
        int leftLen;
        int maxLen;
        int maxLeftValue;

        Result(int leftLen, int maxLeftValue) {
            this.leftLen = leftLen;
            this.maxLen = 0;
            this.maxLeftValue = maxLeftValue;
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        Result result = recur(root, new Result(0, root.val));

        return result.maxLeftValue;
    }

    private Result recur(TreeNode cur, Result result) {
        if (cur.left == null && cur.right == null) {
            if (result.leftLen > result.maxLen) {
                result.maxLen = result.leftLen;
                result.maxLeftValue = cur.val;
            }

            return result;
        }

        if (cur.left != null) {
            result.leftLen++;
            recur(cur.left, result);
            result.leftLen--;
        }

        if (cur.right != null) {
            result.leftLen++;
            recur(cur.right, result);
            result.leftLen--;
        }

        return result;
    }
}