package 编程随想录.f0数组;

class Solution704 {
    // 其实不太简单
    // 还是得记算法：左右区间
    /*
     * case:
     *  [0 2 4 6] -1/3/7
     *  [0 2 3 4 6] -1/1/7
     *  [5] -5
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // 也即 target 在更小的区间
                // right 减小
                right = mid - 1;
            } else {
                // left 增加
                left = mid + 1;
            }
        }

        return -1;
    }
}