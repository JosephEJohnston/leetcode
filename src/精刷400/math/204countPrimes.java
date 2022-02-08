package 精刷400.math;

import java.util.Arrays;

class Solution204 {
    public int countPrimes(int n) {
        boolean[] signs = new boolean[n];
        Arrays.fill(signs, false);

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!signs[i]) {
                count++;
                for (int j = i + i; j < n; j += i)
                    signs[j] = true;
            }
        }


        return count;
    }

    // 厄拉多塞筛法，bitmap 优化
    public int countPrimes1(int n) {
        int[] signs = new int[n / 32 + 1];

        int count = 0;
        for (int i = 2; i < n; i++) {
            if ((signs[i / 32] & (1 << i)) >> i == 0) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    signs[j / 32] |= (1 << j);
                }
            }
        }

        return count;
    }
}