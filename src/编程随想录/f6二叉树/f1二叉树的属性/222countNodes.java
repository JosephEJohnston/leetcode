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
class Solution222 {
    // 最后一层节点不一定是满的
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        int leftHeight = 0, rightHeight = 0;
        while (left != null) {
            left = left.left;
            leftHeight++;
        }

        while (right != null) {
            right = right.right;
            rightHeight++;
        }

        if (leftHeight == rightHeight) {
            return (2 << leftHeight) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}