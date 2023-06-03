package 编程随想录.f7动态规划.f2背包问题.f2完全背包;

class Solution377 {
    // target 是索引，dp[j] 是组合数
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];

        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }

            /*for (int value : dp) {
                System.out.printf("%5d ", value);
            }
            System.out.println();*/
        }

        return dp[target];
    }

    public static void main(String[] args) {
        Solution377 solution377 = new Solution377();

        solution377.combinationSum4(new int[]{1, 2, 3}, 4);
    }
}