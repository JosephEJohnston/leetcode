package 编程随想录.动态规划.f2背包问题;

class Solution416 {
    // 如何暴力破解？回溯当然可以
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 1) {
            return false;
        }

        int target = sum / 2;

        int[][] dp = new int[nums.length][target + 1];

        for (int i = nums[0]; i <= target; i++) {
            dp[0][i] = nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                // 背包容量可以容纳 nums[i]
                if (j >= nums[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[nums.length - 1][target] == target;
    }
}