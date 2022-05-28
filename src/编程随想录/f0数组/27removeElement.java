package 编程随想录.f0数组;

class Solution27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return nums.length;
        }

        int leftp = 0, rightp = 0;
        while (rightp < nums.length) {
            if (nums[rightp] != val) {
                nums[leftp]= nums[rightp];
                leftp++;
            }
            rightp++;
        }

        return leftp;
    }
}