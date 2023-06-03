package 编程随想录.f7动态规划.f2背包问题.f2完全背包;

class Solution518 {
    // dp 下标是 amount，dp[j] 是组合总数
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                // 其实有点模拟递归的意思
                dp[j] = dp[j - coin] + dp[j];
            }
        }

        return dp[amount];
    }

}