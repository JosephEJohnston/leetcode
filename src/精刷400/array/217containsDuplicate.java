package 精刷400.array;

import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }

        return false;
    }
}