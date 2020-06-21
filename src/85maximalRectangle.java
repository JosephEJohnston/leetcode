import java.util.Arrays;
import java.util.Stack;

/*
class Solution {
    //1. 暴力法：
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int maxArea = 0;
        //第一层遍历：对每一个点
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                //第二层遍历：对每一个点的所有对角点
                for (int k = i; k < matrix.length; k++) {
                    for (int l = j; l < matrix[0].length; l++) {

                        //第三层循环：检查两点组成的矩形是否合法
                        int m, n = j;
                        int flag = 1;
                        for (m = i; m <= k; m++) {
                            for (n = j; n <= l; n++) {
                                if (matrix[m][n] == '0') {
                                    flag = 0;
                                    break;
                                }
                            }
                        }

                        if (m == k + 1 && n == l + 1 && flag != 0) {
                            maxArea = Math.max(maxArea, (k - i + 1)*(l - j + 1));
                        }
                    }
                }
            }
        }
        return maxArea;
    }

    //2. 动态规划：柱状图暴力优化
    public static int maximalRectangle1(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;

        int[][] rec = new int[matrix.length][matrix[0].length];

        //记录每个点所对应的行宽度
        for (int i = 0; i < matrix.length; i++) {

            rec[i][0] = matrix[i][0] == '1' ? 1 : 0;
            for (int j = 1; j < matrix[0].length; j++) {
                rec[i][j] = matrix[i][j] == '1' ?
                        rec[i][j - 1] + 1 : 0;

                //System.out.print(rec[i][j] + " ");
            }
            //System.out.println();
        }

        int maxArea = 0;
        //第一层遍历：对于每个点
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    int width = 1, minLongth = rec[i][j];


                    for (int k = i; k < matrix.length; k++, width++) {
                        minLongth = Math.min(minLongth, rec[k][j]);

                        if (rec[k][j] == 0)
                            width = 0;
                        maxArea = Math.max(maxArea, width * minLongth);

                        //System.out.print(k + "=" + maxArea + ":" + width + "-" + rec[k][j] + "  ");
                    }
                    //System.out.println();
                }
            }
        }

        return maxArea;
    }

    //3. 栈：柱状图
    public static int maximalRectangle2(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;

        //记录每个点所对应的行宽度
        //注意，多出来的第一行和最后一行填 0
        int[][] rec = new int[matrix.length + 2][matrix[0].length];
        //注意，i 从 1 开始，到 length + 1 结束。即跳过第一行和最后一行
        for (int i = 1; i < matrix.length + 1; i++) {
            rec[i][0] = matrix[i - 1][0] == '1' ? 1 : 0;
            for (int j = 1; j < matrix[0].length; j++) {
                rec[i][j] = matrix[i - 1][j] == '1' ?
                        rec[i][j - 1] + 1 : 0;
            }
        }

        //利用单调栈得出每一列（柱状图）的最大面积
        int maxArea = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < matrix.length + 2; i++) {
                while (!stack.empty() && rec[stack.peek()][j] > rec[i][j]) {
                    //注意 pop 和 peek 的顺序
                    maxArea = Math.max(maxArea, rec[stack.pop()][j] * (i - stack.peek() - 1));
                }
                stack.push(i);
            }
        }


        return maxArea;
    }

    //4. 动态规划：每个点的最大高度
    public static int maximalRectangle3(char[][] matrix) {
        int maxArea = 0;

        if (matrix == null || matrix.length == 0)
            return 0;

        int n = matrix[0].length;

        int[] heigth = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        Arrays.fill(right, n);


        */
/**
         * left 和 right 数组的计算方式：
         *  由上一行数组和当前行矩阵数组是否为一得出
         *      这两个数组存储了每点最“窄”的两个值
         *//*


        for (int i = 0; i < matrix.length; i++) {

            int curLeft = 0, curRight = n;
            for (int j = 0; j < n; j++) {
                heigth[j] = matrix[i][j] == '0' ? 0 : heigth[j] + 1;

                if (matrix[i][j] == '1') {
                    left[j] = Math.max(curLeft, left[j]);
                } else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }

            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    right[j] = Math.min(curRight, right[j]);
                } else {
                    right[j] = n;
                    curRight = j;
                }
            }

            for (int j = 0; j < n; j++) {
                //在为 0 点计算为负值
                maxArea = Math.max(maxArea, (right[j] - left[j] - 1) * heigth[j]);
            }
        }

        return maxArea;
    }
}*/
