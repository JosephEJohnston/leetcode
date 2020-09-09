package 精刷400.array;

class Solution123 {
    public static void main(String[] args) {
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int dp1 = 0, dp2 = 0;
        int min1 = prices[0], min2 = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min1 = Math.min(prices[i], min1);
            dp1 = Math.max(dp1, prices[i] - min1);

            min2 = Math.min(prices[i] - dp1, min2);
            dp2 = Math.max(dp2, prices[i] - min2);
        }

        return dp2;
    }
}

