package 编程随想录.动态规划.f5子序列问题.f2子序列_连续;


class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int dp = 1;

        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp += 1;
            } else {
                dp = 1;
            }

            if (dp > result) {
                result = dp;
            }
        }

        return result;
    }
}