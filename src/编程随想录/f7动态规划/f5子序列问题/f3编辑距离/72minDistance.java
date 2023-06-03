package 编程随想录.f7动态规划.f5子序列问题.f3编辑距离;

class Solution72 {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int[][] dp = new int[chars1.length + 1][chars2.length + 1];

        for (int i = 0; i <= chars1.length; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= chars2.length; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math
                            .min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }

        return dp[chars1.length][chars2.length];
    }
}