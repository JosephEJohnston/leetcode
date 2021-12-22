package hot100.middle;

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        return quickSortAndGetKth(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSortAndGetKth(int[] nums, int left, int right, int index) {
        int splitIndex = partition(nums, left, right);

        if (splitIndex == index) {
            return nums[index];
        }

        if (index < splitIndex) {
            return quickSortAndGetKth(nums, left, splitIndex - 1, index);
        } else {
            return quickSortAndGetKth(nums, splitIndex + 1, right, index);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] <= nums[right]) {
                i = i + 1;

                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

        int tmp = nums[i + 1];
        nums[i + 1] = nums[right];
        nums[right] = tmp;

        return i + 1;
    }
}