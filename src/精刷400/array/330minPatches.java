package 精刷400.array;

class Solution330 {
    public int minPatches(int[] nums, int n) {
        int patches = 0, i = 0;
        long miss = 1; // 累加覆盖范围，否则添加数字 miss
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss)
                miss += nums[i++];
            else {
                miss += miss;
                patches++;
            }
        }

        return patches;
    }
}