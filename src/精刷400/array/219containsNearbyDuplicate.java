package 精刷400.array;

import java.util.HashSet;
import java.util.Set;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            // 非常的灵性
            if (set.size() > k)
                set.remove(nums[i - k]);
        }
        return false;
    }
}