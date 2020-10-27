package 精刷400.array;

import java.util.HashSet;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> mainSet = new HashSet<>();
        HashSet<Integer> ansSet = new HashSet<>();

        for (int i : nums1)
            mainSet.add(i);

        for (int i : nums2) {
            if (mainSet.contains(i))
                ansSet.add(i);
        }

        int[] ans = new int[ansSet.size()];
        int i = 0;
        for (Integer integer : ansSet) {
            ans[i++] = integer;
        }

        return ans;
    }
}