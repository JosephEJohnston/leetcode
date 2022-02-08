package 精刷400.tree;

class Solution111 {
    public int recursion(TreeNode node, Integer count, Integer min) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                if (count < min)
                    min = count;
            } else if (count < min){
                return Math.min(recursion(node.left, count + 1, min),
                        recursion(node.right, count + 1, min));
            }
        }
        return min;
    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return recursion(root, 1, Integer.MAX_VALUE);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}