package 编程随想录.动态规划.f5子序列问题.f1子序列_不连续;

class Solution1143 {
    // 好吧，乍一眼看上去还是不会

    /**
     * dp[i][j]：长度为 [0, i - 1] 的字符串 text1 与
     *      长度为 [0, j - 1] 的字符串 text2 的最长公共子序列长度为 dp[i][j]
     *      
     */
    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();

        int[][] dp = new int[chars1.length + 1][chars2.length + 1];

        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length ; j++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[chars1.length][chars2.length];
    }
}