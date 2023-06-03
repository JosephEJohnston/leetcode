package 编程随想录.f0数组;

import java.util.Arrays;

class Solution59 {
    // 这道题不涉及算法，就是进行操作模拟
    // 难度其实很大，诀窍在于把边界值固定下来，索引移动的时候定边
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        if (n == 1) {
            return new int[][] {{1}};
        }

        int fillCount = 1;
        int level = n;
        int init = 0;
        while (level >= 1) {
            int levelTotalFill = level * level - (level - 2) * (level - 2);
            if (level == 1) {
                levelTotalFill = 1;
            }

            int i = init, k = init;
            int borderIndex = n - init - 1;

            for (; levelTotalFill > 0 ; levelTotalFill--) {
                result[i][k] = fillCount++;

                if (i == init && k < borderIndex) {
                    k++;
                } else if (k == borderIndex && i < borderIndex) {
                    i++;
                } else if (k > init && i == borderIndex) {
                    k--;
                } else if (k == init && i > init) {
                    i--;
                }
            }

            level -= 2;
            init++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();

        int[][] matrix = solution59.generateMatrix(5);

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}