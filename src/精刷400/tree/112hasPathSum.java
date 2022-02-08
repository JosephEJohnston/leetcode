package 精刷400.tree;

class Solution112 {
    public boolean recursion(TreeNode node, int cur, int sum) {
        if (node != null) {
            if (node.left == null && node.right == null
                    && node.val + cur == sum)
                return true;
            else {
                return recursion(node.left, node.val + cur, sum) ||
                        recursion(node.right, node.val + cur, sum);
            }
        }
        return false;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return recursion(root, 0, sum);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}