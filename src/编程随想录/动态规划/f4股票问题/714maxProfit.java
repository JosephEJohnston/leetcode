package 编程随想录.动态规划.f4股票问题;

class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        // 0：买入，1：卖出
        int[][] dp = new int[2][2];
        dp[0][0] = -prices[0] - fee;

        for (int i = 1; i < n; i++) {
            dp[i % 2][0] = Math.max(dp[(i - 1) % 2][0], dp[(i - 1) % 2][1] - prices[i] - fee);
            dp[i % 2][1] = Math.max(dp[(i - 1) % 2][1], dp[(i - 1) % 2][0] + prices[i]);
        }

        return dp[(n - 1) % 2][1];
    }
}