package 编程随想录.动态规划.f1基础题目;

class Solution70 {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int tmp = second;

            second = second + first;
            first = tmp;
        }

        return second;
    }
}
