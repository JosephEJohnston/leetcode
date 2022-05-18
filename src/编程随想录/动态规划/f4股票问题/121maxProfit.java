package 编程随想录.动态规划.f4股票问题;

class Solution121 {
    // 显然暴力法可以解
    // 动态规划是二维数组
    public int maxProfit(int[] prices) {
        int length = prices.length;

        if (length == 0) {
            return 0;
        }

        int[][] dp = new int[2][2];
        dp[0][0] -= prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < length; i++) {
            // 第一维存最低的成本
            dp[i % 2][0] = Math.max(dp[(i - 1) % 2][0], -prices[i]);
            // 第二维存最高利润
            dp[i % 2][1] = Math.max(dp[(i - 1) % 2][1], prices[i] + dp[(i - 1) % 2][0]);
        }

        return dp[(length - 1) % 2][1];
    }
}