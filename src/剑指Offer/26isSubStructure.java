package 剑指Offer;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public boolean recursion(TreeNode A, TreeNode B) {
        if (A == null && B != null)
            return false;
        else if (B == null)
            return true;

        if (A.val == B.val) {
            return recursion(A.left, B.left) &&
                    recursion(A.right, B.right);
        }

        return false;
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean flag = false;

        if (B == null) {
          return false;
        } else if (A != null) {
            flag |= isSubStructure(A.left, B);
            flag |= isSubStructure(A.right, B);

            if (A.val == B.val)
                flag |= recursion(A, B);
        }
        return flag;
    }
}

