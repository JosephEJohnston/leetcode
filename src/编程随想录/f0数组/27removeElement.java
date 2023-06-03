package 编程随想录.f0数组;

class Solution27 {
    // 没什么难的
    public int removeElement(int[] nums, int val) {
        int curIndex = 0;
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }

            nums[curIndex] = nums[i];
            curIndex++;
            length++;
        }

        return length;
    }
}