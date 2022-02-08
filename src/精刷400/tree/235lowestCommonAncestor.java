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

class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode anc = root;
        while (true) {
            if (p.val > anc.val && q.val > anc.val) {
                anc = anc.right;
            } else if (p.val < anc.val && q.val < anc.val) {
                anc = anc.left;
            } else
                break;
        }
        return anc;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}