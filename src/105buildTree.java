/*
import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0)
            return null;

        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return root;
        }

        int middle;
        for (middle = 0; middle < inorder.length; middle++) {
            if (inorder[middle] == preorder[0])
                break;
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + middle),
                Arrays.copyOfRange(inorder, 0, middle));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + middle, preorder.length),
                Arrays.copyOfRange(inorder, middle + 1, inorder.length));

        return root;
    }
}*/
