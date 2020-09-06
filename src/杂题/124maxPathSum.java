/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    int max = Integer.MIN_VALUE;

    //算法：递归
    public int recursion(TreeNode root) {
        if (root != null){
            int lsum, rsum, msum;

            lsum = Math.max(recursion(root.left), 0);
            rsum = Math.max(recursion(root.right), 0);
            msum = root.val + lsum + rsum;

            //取新路径和左右路径间最大者，不参与迭代结果
            //如果是经过此节点的从右到左的路径，可以递归得到
            max = Math.max(msum, max);

            //只对连接的路径进行计算
            return root.val + Math.max(lsum, rsum);
        }

        return 0;
    }

    public int maxPathSum(TreeNode root) {
        return Math.max(recursion(root), max);
    }
}*/
