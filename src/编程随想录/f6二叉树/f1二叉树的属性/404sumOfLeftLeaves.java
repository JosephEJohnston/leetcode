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
class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                continue;
            }

            queue.offer(node.right);

            TreeNode leftNode = node.left;
            if (leftNode == null) {
                continue;
            }

            if (leftNode.left == null && leftNode.right == null) {
                sum += leftNode.val;
            } else {
                queue.offer(leftNode);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        Solution404 solution404 = new Solution404();
        System.out.println(solution404.sumOfLeftLeaves(root));
    }
}