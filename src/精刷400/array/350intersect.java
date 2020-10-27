package 精刷400.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mainMap = new HashMap<>();

        for (int i : nums1) {
            mainMap.put(i, mainMap.getOrDefault(i, 0) + 1);
        }

        int[] ans = new int[nums1.length];
        int size = 0;
        for (int i : nums2) {
            int cm = mainMap.getOrDefault(i, 0);
            if (cm > 0) {
                mainMap.put(i, cm - 1);
                ans[size++] = i;
            }
        }

        return Arrays.copyOfRange(ans, 0, size);
    }
}