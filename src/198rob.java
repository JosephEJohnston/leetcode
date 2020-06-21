/*
class Solution {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 1, 1, 2}));
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
    }

    */
/*//*
/解法一：暴力法（回溯）
    public static int recursion(int i, int ans, int[] nums) {
        if (i >= nums.length - 1) {
            return ans;
        }
        else {
            int max = 0;
            //为什么是 i + 3？
            //因为 nums[0] + nums[2] < nums[0] + nums[2] + nums[4]
            //就是增加这三个数是基本的状态
            for (int j = i + 1; j < nums.length && j < i + 3; j++) {
                int tmp = recursion(j + 1, ans + nums[j], nums);
                max = Math.max(max, tmp);
            }

            return max;
        }
    }

    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        return recursion(-1, 0, nums);
    }*//*



    //解法二：动态规划
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1)
            return nums[0];

        int[] rec = new int[nums.length];
        rec[0] = nums[0];
        rec[1] = nums[1];
        if (nums.length > 2) {
            rec[2] = nums[0] + nums[2];
        }

        int i;
        for (i = 3; i < nums.length; i++) {
            rec[i] = Math.max(rec[i - 2], rec[i - 3]) + nums[i];
        }

        i = nums.length;
        return Math.max(rec[i - 1], rec[i - 2]);
    }
}*/
