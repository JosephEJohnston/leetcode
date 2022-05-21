package 编程随想录.动态规划.f4股票问题;

class Solution188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0 || k == 0) {
            return 0;
        }

        int height = (k * 2) + 1;
        int[] dp = new int[height];

        for (int i = 1; i < height; i += 2) {
            dp[i] = -prices[0];
        }

        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < height; j++) {
                int value = j % 2 == 0 ? prices[i] : -prices[i];

                dp[j] = Math.max(dp[j], dp[j - 1] + value);
            }
        }

        return dp[height - 1];
    }

    public static void main(String[] args) {
        Solution188 solution188 = new Solution188();

        int[] prices = new int[]{3, 2, 6, 5, 0, 3};
        System.out.println(solution188.maxProfit(2, prices));
    }
}