package 精刷400.array;

import java.util.ArrayList;
import java.util.List;

class Solution229 {

    // 算法有错
    public List<Integer> majorityElement(int[] nums) {
        // 创建返回值
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        // 初始化两个候选人，和它们的计票
        int cand1 = nums[0], count1 = 0;
        int cand2 = nums[0], count2 = 0;

        // 配对阶段
        for (int num : nums) {
            // 投票
            if (count1 == 0 && num != cand2) {
                cand1 = num;
            } else if (count2 == 0 && num != cand1) {
                cand2 = num;
            }

            if (cand1 == num) {
                count1++;
            } else if (cand2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }

        }

        // 计数阶段
        // 找到了两个候选人后，需要确定票数是否大于 N/3
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (cand1 == num)
                count1++;
            else if (cand2 == num)
                count2++;
        }

        if (count1 > nums.length / 3)
            res.add(cand1);
        if (count2 > nums.length / 3)
            res.add(cand2);

        return res;
    }
}