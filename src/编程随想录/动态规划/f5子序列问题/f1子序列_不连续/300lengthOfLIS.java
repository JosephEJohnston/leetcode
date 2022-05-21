package 编程随想录.动态规划.f5子序列问题.f1子序列_不连续;

import java.util.Arrays;

class Solution300 {
    // 没思路，看答案吧

    /**
     * dp[i]：表示 i 之前包括 i 的以 nums[i] 结尾最长上升子序列的长度
     * 位置 i 的最长升序子序列等于 j 从 0 到 i-1 各个位置的最长升序子序列 + 1 的最大值
     */
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int result = 0;

        // 两轮遍历，每轮更新所有子序列的最大长度
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (dp[i] > result) {
                result = dp[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution300 solution300 = new Solution300();

        System.out.println(solution300.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }
}