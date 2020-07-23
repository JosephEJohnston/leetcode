class Solution {
    public static int binSearch(int[] nums, int target, int left, int right) {

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right])
            return binSearch(nums, target, 0, right);

        //查找最小点
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid + 1] < nums[mid])
                break;
            else if (nums[left] < nums[mid]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            }
        }
        System.out.println(nums[mid + 1]);

        //找出最小点后，进行二分查找
        if (target == nums[mid])
            return mid;
        else if (target < nums[mid] && target >= nums[0])
            return binSearch(nums, target, 0, mid);
        else
            return binSearch(nums, target, mid + 1, nums.length - 1);

    }
}