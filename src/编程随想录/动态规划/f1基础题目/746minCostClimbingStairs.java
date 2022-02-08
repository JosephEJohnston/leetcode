package 编程随想录.动态规划.f1基础题目;

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];

        int length = cost.length;
        int current = 0;
        for (int i = 2; i < length; i++) {
            current = Integer.min(first, second) + cost[i];
            first = second;
            second = current;
        }

        return Integer.min(first, second);
    }

}
