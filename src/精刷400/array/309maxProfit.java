package 精刷400.array;

class Solution309 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        int n = prices.length;
        // f[i][0]: 有股票时的最大收益
        // f[i][1]: 无股票，且处于冷冻期中的最大收益
        // f[i][2]: 无股票，且不在冷冻期中的累计最大收益
        int[][] f = new int[n][3];

        // 小细节，在第 0 天时持有股票只能在前一天买入，只有成本
        f[0][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            // 之前持有（f[i-1][0]），或买当前股票(f[i-1][2]-prices[i])
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            // 转为冷冻期的唯一理由就是出售股票
            // 就是把持有股票以当前价格出售，成本已经算过了
            f[i][1] = f[i - 1][0] + prices[i];
            // 卖完股票（从冷冻期转过来）或无操作
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }

        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}