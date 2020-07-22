/*
class Solution {
    static int test = 1;

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";

        int len = s.length();
        int[][] rec = new int[len][len];
        String ans = "";

        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                boolean flag = s.charAt(i) == s.charAt(j);
                if (j == i)
                    rec[i][j] = 1;
                else if (j == i + 1)
                    rec[i][j] = flag ? 1 : 0;
                else {
                    if (flag) {
                        rec[i][j] = rec[i + 1][j - 1];
                    }
                }

                if (rec[i][j] == 1 && ans.length() < j - i + 1)
                    ans = s.substring(i, j + 1);
            }
        }

        return ans;
    }
}*/
