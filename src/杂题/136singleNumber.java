/*class Solution {
    public int singleNumber(int[] nums) {
        //数组非空，这里不做检查

        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur ^= nums[i];
        }

        return cur;
    }
}*/
