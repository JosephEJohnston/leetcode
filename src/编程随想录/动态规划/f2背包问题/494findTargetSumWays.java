package 编程随想录.动态规划.f2背包问题;

class Solution494 {
    // 最简单就是回溯法
    // left - right = target
    // left - (sum - left) = target -> left = (target + sum) / 2
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if ((target + sum) % 2 != 0) {
            return 0;
        }

        int size = (target + sum) / 2;
        if (size < 0) {
            size = -size;
        }

        int[] dp = new int[size + 1];
        // 装满容量为 0 的背包，有 1 中方法，就是装 0 件物品
        dp[0] = 1;

        // dp[j]：填满 j（包括 j）这么大容积的包，有 dp[j] 种方法
        // 填满容量 j-nums[i] 的背包，有 dp[j-nums[i]] 种方法
        // 凑出 ((j - nums[i]), nums[i]) 的所有可能性，为组合类动态规划
        for (int num : nums) {
            for (int j = size; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        // 用脑子过一下，dp 是怎么得到值的。
        return dp[size];
    }
}

