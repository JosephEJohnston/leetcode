package 编程随想录.动态规划.f3打家劫舍;

class Solution213 {
    // 是动态规划，但需要一个数组记录取没取第一个
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(robSub(0, nums.length - 1, nums),
                robSub(1, nums.length, nums));
    }

    private int robSub(int start, int end, int[] nums) {
        int[] dp = new int[end - start];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i]);
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        Solution213 solution213 = new Solution213();

        int rob = solution213.rob(new int[]{1, 1, 1, 2});

        System.out.println(rob);
    }
}