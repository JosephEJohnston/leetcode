package 编程随想录.f7动态规划.f5子序列问题.f3编辑距离;

class Solution115 {
    // 很难，看答案了

    /**
     * dp[i][j]：以 i-1 为结尾的 s 子序列中出现以 j-1 为结尾的 t 的个数为 dp[i][j]
     * 例子：(babg, bag) = (bab, ba) + (bab, bag)
     */
    public int numDistinct(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[][] dp = new int[sChars.length + 1][tChars.length + 1];

        for (int i = 0; i <= sChars.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= sChars.length; i++) {
            for (int j = 1; j <= tChars.length; j++) {
                if (sChars[i - 1] == tChars[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }


        return dp[sChars.length][tChars.length];
    }

    public static void main(String[] args) {
        Solution115 solution115 = new Solution115();

        String s = "babgbag";
        String t = "bag";

        solution115.numDistinct(s, t);
    }
}