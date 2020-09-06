/*class Solution {

    //算法 1：暴力法
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int in = 0; in < prices.length; in++) {
            for (int out = in + 1; out < prices.length; out++) {
                max = Math.max(max, prices[out] - prices[in]);
            }
        }

        return max;
    }

    //算法 2：一次遍历

    *//**
     * 为什么这样一次遍历是对的？：
     *      因为最低值是动态变化的
     *      如果整个数组的最小值所能得到的盈利，小于局部最小值所得盈利
     *          则这个局部最小值所得盈利会更新为最大值
     * @param prices
     * @return
     *//*
    public int maxProfit1(int[] prices) {
        int minPrice = Integer.MAX_VALUE, max = 0;

        for (int price : prices) {
            if (minPrice > price)
                minPrice = price;
            else
                max = Math.max(price - minPrice, max);
        }

        return max;
    }
}*/

