package 编程随想录.动态规划.f1基础题目;

class Solution96 {
    // 置一个节点为根节点，左右节点有不同数量的重叠子问题
    public int numTrees(int n) {
        int[] memory = new int[n + 1];
        memory[0] = 1;
        memory[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                memory[i] += (memory[i - j - 1] * memory[j]);
            }
        }

        return memory[n];
    }
}