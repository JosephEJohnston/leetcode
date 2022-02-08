package 精刷400.tree;


import java.util.Comparator;

class Solution108 {
    public TreeNode recursion(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = (right + left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = recursion(nums, left, mid - 1);
        node.right = recursion(nums, mid + 1, right);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return recursion(nums, 0, nums.length - 1);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}