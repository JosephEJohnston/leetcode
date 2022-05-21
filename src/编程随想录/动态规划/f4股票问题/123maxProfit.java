package 编程随想录.动态规划.f4股票问题;

class Solution123 {
    // 没啥思路

    /**
     * 一天一共就有五个状态
     * 0. 没有操作
     * 1. 第一次买入
     * 2. 第一次卖出
     * 3. 第二次买入
     * 4. 第二次卖出
     * dp[i][j] 中 i 表示第 i 天
     * j 为 [0 - 4] 五个状态，dp[i][j] 表示第 i 天状态 j 所剩最大现金
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int[][] dp = new int[prices.length][5];

        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }

        /*for (int i = 0; i < 5; i++) {
            for (int[] ints : dp) {
                System.out.printf("%5d ", ints[i]);
            }
            System.out.println();
        }*/

        return dp[prices.length - 1][4];
    }

    public static void main(String[] args) {
        Solution123 solution123 = new Solution123();

        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};

        solution123.maxProfit(prices);

    }
}