package 编程随想录.f2哈希表;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer other = map.get(target - nums[i]);
            if (other != null) {
                return new int[] {i, other};
            }

            // 这是个小坑，需要放在后面
            map.put(nums[i], i);
        }

        return null;
    }
}