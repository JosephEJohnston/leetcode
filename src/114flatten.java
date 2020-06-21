/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val ;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    //应当是依照前序遍历展开
    public void flatten(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode tmp = null;

        stack.push(root);
        while (!stack.empty()) {
            tmp = stack.pop();

            queue.add(tmp);
            if (tmp.right != null)
                stack.push(tmp.right);
            if (tmp.left != null)
                stack.push(tmp.left);
        }

        tmp = queue.remove();
        TreeNode next;
        while (!queue.isEmpty()) {
            next = queue.remove();
            tmp.left = null;
            tmp.right = next;
            tmp = next;
        }
    }
}
*/
