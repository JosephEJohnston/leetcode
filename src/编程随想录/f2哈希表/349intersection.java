package 编程随想录.f2哈希表;

import java.util.HashSet;
import java.util.Set;

class Solution349 {
    // 没有特别好的解法，看下答案
    // 用两个集合即可
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 ||
                nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }

        int[] resArr = new int[resSet.size()];
        int index = 0;
        for (Integer i : resSet) {
            resArr[index++] = i;
        }

        return resArr;
    }
}