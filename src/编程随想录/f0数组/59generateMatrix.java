package 编程随想录.f0数组;

class Solution59 {
    // 有点鬼畜，看答案
    // 这道题不涉及算法，就是进行操作模拟
    public int[][] generateMatrix(int n) {
        if (n == 1) {
            return new int[][]{{1}};
        }

        int[][] result = new int[n][n];

        int value = 1;
        int left = 0, right = n - 1;
        while (n > 0) {
            int i = left, j = left;

            int cur;
            if (n != 1) {
                cur = n * n - (n - 2) * (n - 2);
            } else {
                cur = 1;
            }
            while (cur > 0) {
                result[i][j] = value;
                // System.out.println(i + " " + j + " " + value);
                if (i == left && j < right) {
                    j++;
                } else if (j == right && i < right) {
                    i++;
                } else if (i == right && j > left) {
                    j--;
                } else if (j == left && i > left) {
                    i--;
                }
                cur--;
                value++;
            }
            n -= 2;
            left++;
            right--;
        }

        /*for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.printf(String.format("%5d ", anInt));
            }
            System.out.println();
        }*/

        return result;
    }

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();

        solution59.generateMatrix(4);
    }
}