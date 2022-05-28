package 编程随想录.f0数组;

class Solution977 {
    // 找到从负到正的临界点，从此处开始遍历
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int mid = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] * nums[i] <= 0) {
                mid = i;
                break;
            }
        }

        if (mid == 0) {
            mid = nums[nums.length - 1] > 0 ? 0 : nums.length - 1;
        }

        int left = mid - 1, right = mid;
        int index = 0;
        int[] result = new int[nums.length];
        while (left >= 0 || right < nums.length) {
            if (left >= 0 && right < nums.length) {
                int sL = square(nums[left]);
                int sR = square(nums[right]);

                if (sL < sR) {
                    result[index] = sL;
                    left--;
                } else {
                    result[index] = sR;
                    right++;
                }
            } else if (left >= 0) {
                result[index] = square(nums[left]);
                left--;
            } else {
                result[index] = square(nums[right]);
                right++;
            }
            index++;
        }

        return result;
    }

    private int square(int n) {
        return n * n;
    }
}