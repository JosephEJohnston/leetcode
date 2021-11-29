package hot100;

/**
 * 解法：
 * 排除最高位的动态规划
 * 最高位判断：y&(y-1)=0
 * result[i] = result[currentHighestLogTwo] + result[i - currentHighestLogTwo];
 *
 */
class Solution338 {
    public int[] countBits(int n) {
        if (n == 0) {
            return new int[] {0};
        }

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        int currentHighestLogTwo = 2;
        for (int i = 2; i <= n; i++) {
            if (isLogTwo(i)) {
                result[i] = 1;
                currentHighestLogTwo = i;
            } else {
                result[i] = result[currentHighestLogTwo]
                        + result[i - currentHighestLogTwo];
            }
        }

        return result;
    }

    private boolean isLogTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}