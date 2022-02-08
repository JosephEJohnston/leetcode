package 精刷400.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution257 {
    public void recursion(TreeNode root, StringBuilder str, List<String> list) {
        if (root != null) {
            StringBuilder newStr = new StringBuilder(str);
            newStr.append(root.val);
            if (root.left == null && root.right == null)
                list.add(newStr.toString());
            else {
                newStr.append("->");
                recursion(root.left, newStr, list);
                recursion(root.right, newStr, list);
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        recursion(root, new StringBuilder(), list);
        return list;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}