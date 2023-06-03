package 编程随想录.f7动态规划.f4股票问题;

class Solution122 {
    // 看不出这和动态规划有啥关系
    /**
     * dp[i][0] 表示第 i 天持有股票所得现金
     * dp[i][1] 表示第 i 天不持有股票所得最多现金
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[2];

        dp[0] = -prices[0];

        for (int i = 1; i < n; i++) {
            // 持有
            dp[0] = Math.max(dp[0], dp[1] - prices[i]);
            // 不持有
            dp[1] = Math.max(dp[1], dp[0] + prices[i]);
        }

        return dp[1];
    }

    public static void main(String[] args) {
        Solution122 solution122 = new Solution122();

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        solution122.maxProfit(prices);
    }
}