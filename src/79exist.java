/*
class Solution {

    //回溯检查是否存在相应的字符
    private static boolean recursion(int i, int x, int y, int[][] record, char[][] board, String word) {
        boolean flag = false;

        if (i == word.length())
            return true;

        if (x - 1 >= 0 && word.charAt(i) ==
                board[x - 1][y] && record[x - 1][y] == 0) {
            record[x - 1][y] = 1;
            flag |= recursion(i + 1, x - 1, y, record, board, word);
            record[x - 1][y] = 0;
        }

        if (flag == true)
            return flag;
        else if (y - 1 >= 0 && word.charAt(i) ==
                board[x][y - 1] && record[x][y - 1] == 0) {
            record[x][y - 1] = 1;
            flag |= recursion(i + 1, x , y - 1, record, board, word);
            record[x][y - 1] = 0;
        }

        if (flag == true)
            return flag;
        else if (x + 1 < board.length && word.charAt(i) ==
                board[x + 1][y] && record[x + 1][y] == 0) {
            record[x + 1][y] = 1;
            flag |= recursion(i + 1, x + 1, y, record, board, word);
            record[x + 1][y] = 0;
        }

        if (flag == true)
            return flag;
        else if (y + 1 < board[0].length && word.charAt(i) ==
                board[x][y + 1] && record[x][y + 1] == 0) {
            record[x][y + 1] = 1;
            flag |= recursion(i + 1, x , y + 1, record, board, word);
            record[x][y + 1] = 0;
        }

        return flag;
    }

    //驱动方法，调用 recursion
    public static boolean exist(char[][] board, String word) {
        //数组元素默认初始化为 0
        int[][] rec = new int[board.length][board[0].length];
        boolean flag = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (flag == false && word.charAt(0) == board[i][j]) {
                    rec[i][j] = 1;
                    flag |= recursion(1, i, j, rec, board, word);
                    rec[i][j] = 0;
                }
            }
        }

        return flag;
    }
}*/
