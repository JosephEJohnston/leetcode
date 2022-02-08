package 编程随想录.动态规划.f1基础题目;

class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] result = new int[m + 1][n + 1];

        result[1][1] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }

                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        return result[m][n];
    }
}