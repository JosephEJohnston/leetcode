package 编程随想录.f2哈希表;

import java.util.*;

class Solution15 {
    // 回溯法可以做，还是看答案吧
    // 双指针也可以做，并且更合适。哈希法就不实现了
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];

                // 去重逻辑不能放在外面，否则会漏掉 0，0，0 的情况

                if (sum > 0) {
                    right--;

                    // 去重
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;

                    // 去重
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else  {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 两个循环都是去重
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    while (right > left && nums[left] == nums[left + 1]) {
                        left--;
                    }

                    // 找到答案时，双指针同时收缩
                    right--;
                    left++;
                }
            }
        }

        return result;
    }
}