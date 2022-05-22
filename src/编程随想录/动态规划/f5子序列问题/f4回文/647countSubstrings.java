package 编程随想录.动态规划.f5子序列问题.f4回文;

class Solution647 {
    // 没思路，看答案

    /**
     * dp[i][j]：表示区间范围[i, j]（注意是左闭右闭）的子串是否是回文子串
     *      是则为 true，否则为 false
     */
    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();

        boolean[][] dp = new boolean[chars.length][chars.length];

        int result = 0;
        // 一定要从下到上，从左到右遍历，这样保证 dp[i+1][j-1] 都是经过计算的
        for (int i = chars.length - 1; i >= 0; i--) {
            // 由于 j 的定义，其必然大于等于 i
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    if (j - i <= 1) {
                        // 情况一：下标 i 与 j 相同，同一个字符例如 a
                        // 情况二：下标 i 与 j 相差为 1，例如 aa
                        result++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        /*
                            情况三：下标 i 与 j 相差大于 1 时，例如 cabac
                                此时 s[i] 与 s[j] 已经相同了，我们看 i
                                到 j 区间是否为回文子串，只需判断 aba 即可
                                aba 的区间就是 i + 1 与 j - 1 区间
                         */
                        result++;
                        dp[i][j] = true;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution647 solution647 = new Solution647();

        solution647.countSubstrings("ababac");
    }
}