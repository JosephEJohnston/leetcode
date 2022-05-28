package 编程随想录.f0数组;

class Solution977 {
    // 双指针法，从两头开始找
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int k = nums.length - 1;
        for (int i = 0, j = k; i <= j;) {
            int sI = nums[i] * nums[i];
            int sJ = nums[j] * nums[j];

            if (sI < sJ) {
                result[k--] = sJ;
                j--;
            } else {
                result[k--] = sI;
                i++;
            }
        }

        return result;
    }
}