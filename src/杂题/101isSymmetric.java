/*
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    //算法 1 的递归调用
    public boolean recursion(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else {
            if (left != null && right != null)
            {
                if (left.val != right.val)
                    return false;
                else
                    return recursion(left.left, right.right) &&
                            recursion(left.right, right.left);
            }
            return false;
        }
    }

    //算法 1：递归
    public boolean isSymmetric(TreeNode root) {
        if (root != null)
            return recursion(root.left, root.right);
        return true;
    }

    //算法 2：迭代
    public boolean isSymmetric1(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode leftNode = null, rightNode = null;

        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            leftNode = queue.remove();
            rightNode = queue.remove();

            if (leftNode != null && rightNode != null) {
                if (leftNode.val != rightNode.val)
                    return false;
                queue.add(leftNode.left);
                queue.add(rightNode.right);
                queue.add(leftNode.right);
                queue.add(rightNode.left);
            } else if (!(leftNode == null && rightNode == null))
                return false;
        }

        return true;
    }
}*/
