package 精刷400.array;

class Solution188 {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int n = prices.length;
        if (k >= n / 2)
            return greedy(prices);

        int[] dp = new int[k + 1];
        int[] min = new int[k + 1];

        for (int i = 0; i <= k; i++)
            min[i] = prices[0];

        for (int i = 1; i < n; i++) {
            for (int t = 1; t <= k; t++) {
                min[t] = Math.min(prices[i] - dp[t - 1], min[t]);
                dp[t] = Math.max(dp[t], prices[i] - min[t]);
            }
        }

        return dp[k];
    }

    private int greedy(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        }

        return max;
    }
}