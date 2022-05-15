package 编程随想录.动态规划.f2背包问题.f1_01背包;

class Solution416 {
    // 如何暴力破解？回溯当然可以
    // 0-1 背包变体，依旧很难

    /**
     * 为什么能分解成背包问题？
     * <p>将容量转换为目标的切割值，如果能容下切割值就代表能切分为两半</p>
     */
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

        // 初始化，先装第 1 个数
        for (int i = nums[0]; i <= target; i++) {
            dp[0][i] = nums[0];
        }

        // i 是数组，j 是容量
        // 从第 2 个数装起
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                // 背包容量可以容纳 nums[i]
                if (j >= nums[i]) {
                    /*
                    对于在容量 j，对第 i 个数字进行判断时：
                        或者选择第 i-1 个数字时的决定
                        或者选择花费容量 nums[i] 来装载容量 nums[i]
                     */
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                    /*
                    没有 Math.max：
                        case：[2, 2, 1, 1]
                     */
//                    dp[i][j] = dp[i - 1][j - nums[i]] + nums[i];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[nums.length - 1][target] == target;
    }

    public static void main(String[] args) {
        Solution416 solution416 = new Solution416();

        /*
        nums = [2, 2, 1, 1];
        wrong:
        0 0 2 2
        0 0 2 2
        0 1 1 3
        0 1 2 2

        right:
        0 0 2 2
        0 0 2 2
        0 1 2 3
        0 1 2 3
         */
        int[] nums = new int[]{ 2, 2, 1, 1 };
        solution416.canPartition(nums);
    }
}