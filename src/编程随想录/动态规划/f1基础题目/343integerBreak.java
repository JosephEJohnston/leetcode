package 编程随想录.动态规划.f1基础题目;

class Solution343 {
    // 重叠子问题，切成两个数的最大乘积必定是这两个数切分的最大乘积的乘积
    // 二维实现，自己的解法
    public int integerBreak(int n) {
        int[] memory = new int[n + 1];
        memory[1] = 1;

        for (int i = 2; i <= n; i++) {
            int roundMax = 1;
            // 优化：j = i / 2
            for (int j = i / 2; j < i; j++) {
                int tmp = i - j;
                int tmpMax;

                tmpMax = Math.max(tmp * memory[j], memory[tmp] * j);
                tmpMax = Math.max(tmpMax, tmp * j);

                roundMax = Math.max(roundMax, tmpMax);
            }
            memory[i] = roundMax;
        }

        return memory[n];
    }
}