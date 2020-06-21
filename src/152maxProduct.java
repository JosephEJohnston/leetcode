import java.util.ArrayList;
import java.util.List;

/*
class Solution {
    */
/*//*
/解法一：递归
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int tmp = 1;
            for (int j = i; j < nums.length; j++) {
                tmp *= nums[j];
                if (tmp > ans)
                    ans = tmp;

            }
        }

        return ans;
    }*//*


    //解法二：动态规划
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int amax = 1, amin = 1;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = amax;
                amax = amin;
                amin = tmp;
            }

            amax = Integer.max(nums[i], amax * nums[i]);
            amin = Integer.min(nums[i], amin * nums[i]);

            ans = Math.max(amax, ans);
        }

        return ans;
    }
}*/
