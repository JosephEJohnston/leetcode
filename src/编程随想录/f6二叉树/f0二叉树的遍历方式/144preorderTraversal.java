package 编程随想录.f6二叉树.f0二叉树的遍历方式;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
class Solution144 {
    // 递归的就不用说了，实现迭代吧
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Deque<TreeNode> st = new LinkedList<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            if (node != null) {
                res.add(node.val);

                // 注意 stack
                st.push(node.right);
                st.push(node.left);
            }
        }

        return res;
    }
}