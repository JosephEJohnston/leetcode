package 编程随想录.f0数组;

class Solution977 {
    // 双指针法，从两头开始找
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = result.length - 1; i >= 0; i--) {
            int nl = Math.abs(nums[left]);
            int nr = Math.abs(nums[right]);

            if (nl > nr) {
                result[i] = nl * nl;
                left++;
            } else {
                result[i] = nr * nr;
                right--;
            }
        }

        return result;
    }
}