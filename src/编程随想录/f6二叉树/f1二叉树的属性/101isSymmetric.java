package 编程随想录.f6二叉树.f1二叉树的属性;

import structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

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
class Solution101 {
    // 迭代实现
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();

            if (leftNode == null && rightNode == null) {
                continue;
            }

            if (leftNode == null || rightNode == null) {
                return false;
            } else if (leftNode.val != rightNode.val) {
                return false;
            }

            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }

        return true;
    }

    /*// 递归实现
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return recur(left.left, right.right) &&
                recur(left.right, right.left);
    }*/
}