package 精刷400.array;

class Solution122 {
    public int maxProfit(int[] prices) {
        int i = 0;
        int vally;
        int peak;
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            vally = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - vally;
        }
        return maxprofit;
    }
}
