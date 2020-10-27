package 精刷400.array;

class Solution283 {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;

        while (i < nums.length) {
            while (j < nums.length && nums[j] == 0)
                j++;
            nums[i++] = j < nums.length ? nums[j++] : 0;
        }
    }
}