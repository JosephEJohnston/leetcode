package 编程随想录.f7动态规划.f5子序列问题.f2子序列_连续;

class Solution53 {
    // 用动归反而有点奇怪
    // 看答案
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];

        int result = dp[0];
        for (int i = 1; i < nums.length; i++) {
            /*
            dp[i] 只有两个方向可以推出来：
                dp[i - 1] + nums[i]，即：nums[i] 加入当前连续子序列和
                nums[i]，即：从头开始计算当前连续子序列和
             */
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);

            if (dp[i] > result) {
                result = dp[i];
            }
        }

        return result;
    }
}