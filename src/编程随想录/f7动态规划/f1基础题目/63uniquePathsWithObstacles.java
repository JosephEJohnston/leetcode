package 编程随想录.f7动态规划.f1基础题目;

/**
 * [[0,1],[0,0]]
 */
class Solution63 {
    // 还有一个空间优化版本
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid.length;
        int height = obstacleGrid[0].length;
        int[][] result = new int[width][height];

        if (obstacleGrid[0][0] == 1 ||
                obstacleGrid[width - 1][height - 1] == 1) {
            return 0;
        }

        for (int i = 0; i < width; i++) {
            if (obstacleGrid[i][0] != 1) {
                result[i][0] = 1;
            }
        }

        for (int i = 0; i < height; i++) {
            if (obstacleGrid[0][i] != 1) {
                result[0][i] = 1;
            }
        }
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }

                if (i > 0 && j > 0) {
                    result[i][j] = result[i][j - 1] + result[i - 1][j];
                } else if (i > 0) {
                    result[i][j] = result[i - 1][j];
                } else if (j > 0) {
                    result[i][j] = result[i][j - 1];
                }
            }
        }

        return result[width - 1][height - 1];
    }
}