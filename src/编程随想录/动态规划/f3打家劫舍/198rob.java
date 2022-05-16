package 编程随想录.动态规划.f3打家劫舍;

class Solution198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = nums[i];
            for (int j = 0; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], dp[j] + nums[i]);
            }
        }

        if (nums.length > 1) {
            return Math.max(dp[dp.length - 1], dp[dp.length - 2]);
        } else {
            return dp[0];
        }
    }
}