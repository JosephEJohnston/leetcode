import java.util.Stack;

/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    //算法 1 的递归
    public boolean recursion(TreeNode root, long lower, long upper) {
        if (root == null) {
            return true;
        } else if (root.val < upper &&
                root.val > lower) {
            return recursion(root.left, lower, root.val) &&
                    recursion(root.right, root.val, upper);
        } else {
            return false;
        }
    }

    //算法 1：递归维护边界
    public boolean isValidBST(TreeNode root) {
        return recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    //算法 2 递归调用
    public boolean inorder(TreeNode root, Stack<Long> stack) {
        boolean ans = true;
        if (root != null) {
            ans &= inorder(root.left, stack);

            if (ans) {
                long value = stack.pop();
                if (value >= root.val)
                    return false;
                else {
                    stack.push((long)root.val);
                    ans &= inorder(root.right, stack);
                }
            }
        }

        return ans;
    }

    //算法 2：中序遍历
    public boolean isValidBST1(TreeNode root) {
        Stack<Long> stack = new Stack<>();
        stack.push(Long.MIN_VALUE);
        return inorder(root, stack);
    }
}*/
