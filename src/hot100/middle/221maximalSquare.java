package hot100.middle;

class Solution221 {
    // 暴力法（超时）：
    /*public int maximalSquare(char[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0')
                    continue;

                max = Integer.max(max, searchEverySquare(matrix, i, j));
            }

        }

        return max;
    }

    private int searchEverySquare(char[][] matrix, int x, int y) {
        int max = 0;
        for (int i = x; i < matrix.length; i++) {
            int width = i - x + 1;
            for (int j = y; j < matrix[i].length; j++) {
                int high = j - y + 1;

                if ((width == high) && checkLengthSquare(matrix, x, y, width, high)) {
                    max = Integer.max(max, width * high);
                }
            }

        }

        return max;
    }

    private boolean checkLengthSquare(char[][] matrix, int x, int y, int width, int high) {
        for (int i = x; i - x + 1 <= width; i++) {
            for (int j = y; j - y + 1 <= high; j++) {
                if (matrix[i][j] == '0') {
                    return false;
                }
            }
        }

        return true;
    }*/

    public int maximalSquare(char[][] matrix) {
        int xLen = matrix.length;
        int yLen = matrix[0].length;

        int[][] dp = new int[xLen][yLen];


    }
}