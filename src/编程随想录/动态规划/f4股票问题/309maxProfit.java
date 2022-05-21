package 编程随想录.动态规划.f4股票问题;

class Solution309 {
    /**
     * 重点是多个状态，和状态之间的转移
     * 不好理解
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[n][4];
        dp[0][0] -= prices[0];

        for (int i = 1; i < n; i++) {
            // 状态一：买入股票状态（今天买入股票，或者之前就买入了股票然后没有操作）
            dp[i][0] = Math.max(dp[i - 1][0], Math
                    .max(dp[i - 1][3], dp[i - 1][1]) - prices[i]);
            // 状态二：两天前就卖出了股票，度过了冷冻期，一直没操作，今天保持卖出股票状态
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
            // 状态三：今天卖出了股票
            dp[i][2] = dp[i - 1][0] + prices[i];
            // 状态四：今天为冷冻期状态，但冷冻期状态不可持续，只有一天
            dp[i][3] = dp[i - 1][2];
        }

        return Math.max(dp[n - 1][3], Math
                .max(dp[n - 1][1], dp[n - 1][2]));
    }

    public static void main(String[] args) {
        Solution309 solution309 = new Solution309();

        int[] prices = new int[]{1, 2, 3, 0, 2};
        System.out.println(solution309.maxProfit(prices));
    }
}