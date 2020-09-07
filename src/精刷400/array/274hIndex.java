package 精刷400.array;

class Solution274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] papers = new int[n + 1];

        // 计数（桶排序计数）
        for (int c : citations) {
            papers[Math.min(n, c)]++;
        }

        // s_k 表示至少有 k 次引用的论文数量
        // s_k < k 来自 h 值定义
        int k = n;
        for (int s = papers[n]; s < k; s += papers[k]) {
            k--;
        }

        return k;
    }
}