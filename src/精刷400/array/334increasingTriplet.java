package 精刷400.array;

class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3)
            return false;

        int small = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }

        return false;
    }
}