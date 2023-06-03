package 编程随想录.f7动态规划.f2背包问题.f2完全背包;

import java.util.Arrays;

class Solution279 {
    public int numSquares(int n) {
        int size = n / 2 + 1;
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = i + 1;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            for (int j = square; j < dp.length; j++) {
                if (dp[j - square] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - square] + 1);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Solution279 solution279 = new Solution279();

        solution279.numSquares(12);
    }
}