package 编程随想录.f6二叉树.f1二叉树的属性;

import structure.TreeNode;

import java.util.ArrayList;
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
class Solution257 {
    // 可用 StringBuilder 优化
    // 字符串加法操作会严重影响性能
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        recur(root, new StringBuilder(String.valueOf(root.val)), res);

        return res;
    }

    private void recur(TreeNode cur, StringBuilder path, List<String> res) {
        if (cur.left == null && cur.right == null) {
            res.add(path.toString());
        }

        if (cur.left != null) {
            StringBuilder builder = new StringBuilder(path);
            builder.append("->").append(cur.left.val);
            recur(cur.left, builder, res);
        }

        if (cur.right != null) {
            StringBuilder builder = new StringBuilder(path);
            builder.append("->").append(cur.right.val);
            recur(cur.right, builder, res);
        }
    }
}