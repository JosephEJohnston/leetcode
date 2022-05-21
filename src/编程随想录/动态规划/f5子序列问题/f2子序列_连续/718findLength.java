package 编程随想录.动态规划.f5子序列问题.f2子序列_连续;

class Solution718 {
    // 刷答案吧
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];

        int result = 0;
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                if (dp[i][j] > result) {
                    result = dp[i][j];
                }
            }
        }

        return result;
    }
}