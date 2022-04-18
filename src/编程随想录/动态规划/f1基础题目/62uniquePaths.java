package 编程随想录.动态规划.f1基础题目;

class Solution62 {
    // 动归解法
    /*public int uniquePaths(int m, int n) {
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
    }*/

    // 组合解法
    /*public int uniquePaths(int m, int n) {
        int cUp = m - 1;
        int cDown = m + n - 2;

        int sumN = 1, sumD = 1;
        while (cUp > 0) {
            sumN *= cDown;
            sumD *= cUp;
            cUp--;
            cDown--;
        }

        return sumN / sumD;
    }*/

    public static void main(String[] args) {
        Solution62 solution62 = new Solution62();

        System.out.println(solution62.uniquePaths(23, 13));
    }

    public int uniquePaths(int m, int n) {
        int cUp = m - 1;
        int cDown = m + n - 2;

        int sumN = 1, sumD = 1;

        while (cUp > 0) {
            sumN *= cDown;
            sumD *= cUp;
            cUp--;
            cDown--;

            int guessCommonFactor = guessCommonFactor(sumN, sumD);
            sumN /= guessCommonFactor;
            sumD /= guessCommonFactor;
        }

        return sumN / sumD;
    }

    private int guessCommonFactor(int m, int n) {
        int[] commonFactor = new int[]{ 30, 15, 10, 6, 5, 3, 2 };

        for (int factor : commonFactor) {
            if (m % factor == 0 && n % factor == 0) {
                return factor;
            }
        }

        return 1;
    }
}