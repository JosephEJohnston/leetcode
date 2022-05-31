package 编程随想录.f2哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution18 {
    // 看答案吧
    // 和第 15 题基本类似
    // 应该是这系列最难的一道题
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int k = 0; k < nums.length; k++) {
            // 剪枝处理
            // k 之后的数都无法组成 target 了
            if (nums[k] > target && (nums[k] >= 0 || target >= 0)) {
                break;
            }

            // 去重
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            for (int i = k + 1; i < nums.length; i++) {
                // 2 级剪枝处理
                // 理由同上
                if (nums[k] + nums[i] > target &&
                        (nums[k] + nums[i] >= 0 || target >= 0)) {
                    break;
                }

                // 正确去重方法
                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (right > left) {
                    // nums[k] + nums[i] + nums[left] + nums[right] > target 会溢出
                    if (nums[k] + nums[i] > target - (nums[left] + nums[right])) {
                        right--;

                        // 当前元素不合适了，可以去重
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (nums[k] + nums[i] < target - (nums[left] + nums[right])) {
                        left++;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                    } else {
                        result.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));

                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        right--;
                        left++;
                    }
                }
            }
        }

        return result;
    }
}