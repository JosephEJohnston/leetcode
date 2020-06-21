/*
class Solution {

    //算法：递归
    public int numTrees(int n) {
        int ans = 0;

        if (n == 0 || n == 1)
            return 1;
        else {
            for (int i = 0; i < n; i++) {
                //减 1 是因为刨除了根
                //以 i 左边的序列为其左子树，右边的序列为其右子树
                ans += numTrees(i) * numTrees(n - i - 1);
            }
        }

        return ans;
    }

    //算法：动态规划
    public int numTrees1(int n) {
        int[] rec = new int[n + 1];

        if (n == 0 || n == 1)
            return 1;
        rec[0] = 1; rec[1] = 1;
        for (int i = 2; i <= n; i++) {
            //减 1 是因为刨除了根
            //以 j 左边的序列为其左子树，右边的序列为其右子树
            //小于 i 是因为不包括其本身（否则 rec[i] += rec[i] * rec[-1] )
            for (int j = 0; j < i; j++) {
                rec[i] += rec[j] * rec[i - j - 1];
            }
        }

        return rec[n];
    }

    //算法：卡塔兰数
    public int numTrees2(int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * 2 * (2 * i + 1) / (i + 2);
        }

        return (int)ans;
    }
}*/
