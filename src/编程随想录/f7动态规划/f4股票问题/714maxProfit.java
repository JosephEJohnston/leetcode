package 编程随想录.f7动态规划.f4股票问题;

class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        // 0：买入，1：卖出
        int[] dp = new int[2];
        dp[0] = -prices[0] - fee;

        for (int i = 1; i < n; i++) {
            dp[0] = Math.max(dp[0], dp[1] - prices[i] - fee);
            dp[1] = Math.max(dp[1], dp[0] + prices[i]);
        }

        return dp[1];
    }
}