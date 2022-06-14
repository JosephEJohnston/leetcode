package 编程随想录.f6二叉树.f0二叉树的遍历方式;

import structure.TreeNode;

import java.util.*;

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
class Solution145 {
    // 迭代没思路，看答案了
    // 递归本身就是一种栈实现，模拟一下
    // 答案后序用了 reverse，看 leetcode 官方答案
    // 还是用 reverse 吧。
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> st = new LinkedList<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            // 入栈：中，左，右
            // 出栈：中，右，左
            if (node != null) {
                res.add(node.val);

                st.push(node.left);
                st.push(node.right);
            }
        }

        // 反转：左，右，中
        Collections.reverse(res);

        return res;
    }
}