package 编程随想录.f6二叉树.f2二叉树的修改与构造;

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
class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        recurInvert(root);

        return root;
    }

    private void recurInvert(TreeNode cur) {
        if (cur == null) {
            return;
        }

        TreeNode tmp = cur.left;
        cur.left = cur.right;
        cur.right = tmp;

        recurInvert(cur.left);
        recurInvert(cur.right);
    }
}