/*
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            return lists;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode tmp;
        int numOfNodes, nextNums, curNums;

        queue.add(root);
        nextNums = 1;
        curNums = 0;
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();

            numOfNodes = nextNums;
            nextNums = 0;
            while (curNums < numOfNodes) {
                tmp = queue.remove();
                curNums++;

                list.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                    nextNums++;
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                    nextNums++;
                }
            }
            curNums = 0;
            lists.add(list);
        }

        return lists;
    }
}*/
