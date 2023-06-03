package 编程随想录.f7动态规划.f2背包问题.f1_01背包;

class Solution494 {
    // 最简单就是回溯法

    // 看起来依旧是非常的奇怪，没有完全理解
    
    // left - right = target
    // left - (sum - left) = target -> left = (target + sum) / 2
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if ((target + sum) % 2 != 0) {
            return 0;
        }

        int size = (target + sum) / 2;
        if (size < 0) {
            size = -size;
        }

        int[] dp = new int[size + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = size; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[size];
    }
}

