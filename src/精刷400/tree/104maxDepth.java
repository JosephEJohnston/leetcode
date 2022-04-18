/*
package 精刷400.tree;

import 精刷400.tree.Solution112;

import java.util.LinkedList;
import java.util.Queue;

*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *//*

class Solution104 {
    //算法 2：迭代
    public int maxDepth(TreeNode root) {
        int ans = 0;
        if (root == null) {
            return ans;
        }

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

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}*/
