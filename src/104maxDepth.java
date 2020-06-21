/*import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    //算法 1 的递归调用
    public int recursion(TreeNode node, int depth) {
        int left, right;

        if (node != null) {
            left = recursion(node.left, depth + 1);
            right = recursion(node.right, depth + 1);
        } else {
            return depth;
        }

        return Math.max(left, right);
    }

    //算法 1：递归
    public int maxDepth(TreeNode root) {
        return recursion(root, 0);
    }

    //算法 2：迭代
    public int maxDepth1(TreeNode root) {
        int ans = 0;
        if (root == null) {
            return ans;
        }

        Pair<TreeNode, Integer> pair;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();

        queue.add(new Pair<>(root, 1));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> tmp = queue.remove();

            if (ans < tmp.getValue())
                ans = tmp.getValue();

            if (tmp.getKey().left != null)
                queue.add(new Pair<>(tmp.getKey().left,
                        tmp.getValue() + 1));
            if (tmp.getKey().right != null)
                queue.add(new Pair<>(tmp.getKey().right,
                        tmp.getValue() + 1));
        }

        return ans;
    }
}*/
