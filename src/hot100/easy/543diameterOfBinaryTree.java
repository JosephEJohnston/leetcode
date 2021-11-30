package hot100.easy;

import structure.TreeNode;

/**
 * 解法：深度优先遍历
 * 本质是在计算节点深度时，顺带记录最多边节点的信息
 */
class Solution543 {
    private int resultMax = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        resultMax = 0;

        depth(root);

        return resultMax - 1;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = depth(root.left);
        int depthRight = depth(root.right);

        resultMax = Integer.max(depthLeft + depthRight + 1, resultMax);

        return Integer.max(depthLeft, depthRight) + 1;
    }
}