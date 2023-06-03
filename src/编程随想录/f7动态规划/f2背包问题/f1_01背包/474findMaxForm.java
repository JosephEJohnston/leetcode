package 编程随想录.f7动态规划.f2背包问题.f1_01背包;

class Solution474 {
    // 01背包问题，二维动态规划，抄答案了
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int oneNum, zeroNum;

        for (String str : strs) {
            oneNum = 0;
            zeroNum = 0;
            for (char ch : str.toCharArray()) {
                if (ch == '0') {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }

            for (int i = m; i >= zeroNum; i--) {
                for (int j = n; j >= oneNum; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }

            /*for (int i = 0; i < m + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    System.out.printf("%5d ", dp[i][j]);
                }
                System.out.println();
            }
            System.out.println("-------------------");*/
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Solution474 solution474 = new Solution474();

        System.out.println(solution474.findMaxForm(
                new String[]{"10", "0001", "111001", "1", "0"}, 5, 3));
    }
}