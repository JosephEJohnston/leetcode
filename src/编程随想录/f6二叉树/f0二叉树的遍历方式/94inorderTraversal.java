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
class Solution94 {
    // 中序：左中右
    // 看答案了
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> st = new LinkedList<>();
        TreeNode cur = root;
        // 入栈顺序：左-右
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                // 优先入栈左节点
                st.push(cur);
                cur = cur.left;
            } else {
                // 当前节点为空，则弹出元素，并递归处理这个元素的右元素
                cur = st.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }

        return res;
    }
}