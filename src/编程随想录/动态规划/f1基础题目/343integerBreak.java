package 编程随想录.动态规划.f1基础题目;

/**
 * https://github.com/youngyangyang04/leetcode-master/blob/master/problems/0343.%E6%95%B4%E6%95%B0%E6%8B%86%E5%88%86.md
 */
class Solution343 {

    // 重叠子问题，切成两个数的最大乘积必定是这两个数切分的最大乘积的乘积
    public int integerBreak(int n) {
        int[] memory = new int[n + 1];
        memory[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                // 代码最少的写法，题解实现
                memory[i] = Math.max(memory[i],
                        Math.max((i - j) * j, memory[i - j] * j));
            }
        }

        return memory[n];
    }

    // 还有一个贪心算法，但需要数学证明
    // 每次拆成 n 个 3，如果剩下是 4，则保留 4，然后相乘
}