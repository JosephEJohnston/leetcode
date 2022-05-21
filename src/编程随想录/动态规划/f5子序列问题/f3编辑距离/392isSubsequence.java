package 编程随想录.动态规划.f5子序列问题.f3编辑距离;

class Solution392 {
    // 和最长公共子序列很类似
    public boolean isSubsequence(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[][] dp = new int[sChars.length + 1][tChars.length + 1];
        for (int i = 1; i <= sChars.length; i++) {
            for (int j = 1; j <= tChars.length; j++) {
                if (sChars[i - 1] == tChars[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[sChars.length][tChars.length] == sChars.length;
    }
}