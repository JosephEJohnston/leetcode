package 精刷400.tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution101 {
    public boolean recursion(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else if (left != null && right != null && left.val == right.val)
            return recursion(left.left, right.right)
                    && recursion(left.right, right.left);
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        else
            return recursion(root.left, root.right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}