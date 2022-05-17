package 编程随想录.动态规划.f3打家劫舍;

import structure.TreeNode;

import java.util.List;

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
class Solution337 {
    // 不容易
    // 树形 dp 入门
    public int rob(TreeNode root) {
        int[] result = robTree(root);

        return Math.max(result[0], result[1]);
    }

    private int[] robTree(TreeNode cur) {
        if (cur == null) {
            return new int[]{0, 0};
        }

        int[] left = robTree(cur.left);
        int[] right = robTree(cur.right);

        // 偷 cur
        int stealCur = cur.val + left[0] + right[0];

        // 不偷 cur
        int not = Math.max(left[0], left[1]) +
                Math.max(right[0], right[1]);

        return new int[]{not, stealCur};
    }
}