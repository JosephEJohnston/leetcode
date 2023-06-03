package 编程随想录.f0数组;

class Solution209 {
    // 看答案
    // 滑动窗口
    // 窗口本身由 i 和 j 构成，每当窗口达到要求，检测结果
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            // 滑动窗口的精妙之处在于，根据当前子序列和大小的情况，不断调节子序列的起始位置
            // 注意循环
            while (sum >= target) {
                int subLength = (j - i + 1);
                result = Math.min(result, subLength);
                sum -= nums[i++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}