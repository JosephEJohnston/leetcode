package 编程随想录.f0数组;

class Solution27 {
    // 没什么难的
    // 2023/6/4 二刷
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }

            nums[curIndex++] = nums[i];
        }

        return curIndex;
    }
}