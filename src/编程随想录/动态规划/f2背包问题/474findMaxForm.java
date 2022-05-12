package 编程随想录.动态规划.f2背包问题;

class Solution474 {
    // 似乎可以转换成两个动态规划问题，一个求 0，一个求 1
    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][] dpm = new int[length][m + 1];
        int[][] dpn = new int[length][n + 1];

        processDp(strs, dpm, length, m + 1, '0');
        processDp(strs, dpn, length, n + 1, '1');

        return Math.max(dpm[length - 1][m], dpn[length - 1][n]);
    }

    private void processDp(String[] strs, int[][] dp, int x, int y, char ch) {
        int countZero = countChar(strs[0], ch);
        for (int i = countZero; i < y; i++) {
            dp[0][i] = countZero;
        }

        for (int i = 1; i < x; i++) {
            int zeroCount = countChar(strs[i], ch);
            for (int j = 0; j < y; j++) {
                if (j >= zeroCount) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - zeroCount]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
    }

    private int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}