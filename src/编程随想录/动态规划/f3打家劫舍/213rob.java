package 编程随想录.动态规划.f3打家劫舍;

class Solution213 {
    // 是动态规划，但需要一个数组记录取没取第一个
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];
        boolean[] first = new boolean[nums.length];

        dp[0] = nums[0];
        first[0] = true;

        if (nums[1] > nums[0]) {
            dp[1] = nums[1];
        } else {
            dp[1] = nums[0];
            first[1] = true;
        }

        for (int i = 2; i < dp.length; i++) {
            for (int j = 2; j <= i; j++) {
                int otherValue = dp[j - 2] + nums[j];
                if (dp[i - 1] > otherValue) {
                    dp[i] = dp[i - 1];
                    first[i] = first[i - 1];
                } else {
                    dp[i] = dp[j - 2] + nums[j];
                    first[i] = first[j - 2];
                }
            }
        }


        if (first[first.length - 1]) {
            return Math.max(dp[dp.length - 2], dp[dp.length - 1] - nums[0]);
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        Solution213 solution213 = new Solution213();

        solution213.rob(new int[]{1, 1, 1, 2});
    }
}