package 编程随想录.动态规划.f4股票问题;

class Solution122 {
    // 看不出这和动态规划有啥关系
    /**
     * dp[i][0] 表示第 i 天持有股票所得现金
     * dp[i][1] 表示第 i 天不持有股票所得最多现金
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[2][2];

        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < n; i++) {
            // 持有
            dp[i % 2][0] = Math.max(dp[(i - 1) % 2][0], dp[(i - 1) % 2][1] - prices[i]);
            // 不持有
            dp[i % 2][1] = Math.max(dp[(i - 1) % 2][1], dp[(i - 1) % 2][0] + prices[i]);
        }

        return dp[(n - 1) % 2][1];
    }

    public static void main(String[] args) {
        Solution122 solution122 = new Solution122();

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        solution122.maxProfit(prices);
    }
}