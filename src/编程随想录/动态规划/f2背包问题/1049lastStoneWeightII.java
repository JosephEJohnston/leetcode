package 编程随想录.动态规划.f2背包问题;

class Solution1049 {
    /*
    思想：
        尽量让石头分成重量相同的两堆，相撞之后剩下的石头最小，这样就化成了 0-1 背包问题
        和 416 分割等和子集非常像
     */
    // dp[i][j] 为容量为 j 的背包所能背的最大重量
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }

        int target = sum / 2;
        int[][] dp = new int[stones.length][target + 1];
        for (int i = stones[0]; i < target + 1; i++) {
            dp[0][i] = stones[0];
        }

        for (int i = 1; i < stones.length; i++) {
            for (int j = 0; j < target + 1; j++) {
                if (j >= stones[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - stones[i]] + stones[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(target);
        for (int i = 0; i < target + 1; i++) {
            System.out.printf("%5d ", i);
        }
        System.out.println();

        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.printf("%5d ", anInt);
            }
            System.out.println();
        }

        return sum - dp[stones.length - 1][target] * 2;
    }

    public static void main(String[] args) {
        Solution1049 solution1049 = new Solution1049();

        int[] stones = new int[]{31, 26, 33, 21, 40};

        solution1049.lastStoneWeightII(stones);
    }
}