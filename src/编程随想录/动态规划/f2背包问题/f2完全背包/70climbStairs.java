package 编程随想录.动态规划.f2背包问题.f2完全背包;

class Solution70 {
    // 斐波那契，完全背包
    public int climbStairs(int n) {
        int[] nums = new int[]{1, 2};

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 0; i <= n; i++) {
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[n];
    }
}